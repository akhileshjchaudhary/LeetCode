class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = 0, pivotIndx = 0; 
        boolean flag = false;

        for(int i = nums.length - 1; i >= 1; i--){
            if(nums[i] > nums[i-1]){
                pivotIndx = i;

                int minGreaterIndex = nums.length - 1;
                while (nums[minGreaterIndex] <= nums[i-1]) {
                    minGreaterIndex--;
                }
                int temp = nums[i-1];
                nums[i-1] = nums[minGreaterIndex];
                nums[minGreaterIndex] = temp;

                flag = true;
                break;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i = pivotIndx; i < nums.length; i++){
            list.add(nums[i]);
        }

  
        Collections.sort(list);
        
        int j = 0;
        for(int i = pivotIndx; i < nums.length; i++){
            nums[i] = list.get(j);
            j++;
        }

        if(flag == false){
            Arrays.sort(nums);
        }
    }
}
