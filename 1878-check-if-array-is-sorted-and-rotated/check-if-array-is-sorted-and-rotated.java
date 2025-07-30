class Solution {
    public boolean check(int[] nums) {
        boolean rotate = false;
        int rotateIndx = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                rotateIndx = i+1;
                rotate = true;
                for(int j=i+1; j<nums.length; j++){
                    list.add(nums[j]);
                }
                break;
            }
        }

        for(int i=0; i<rotateIndx; i++){
            list.add(nums[i]);
        }
        
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)>list.get(i+1)){
                return false;
            }
        }
        return true;
    }
}