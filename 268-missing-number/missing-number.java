class Solution {
    public int missingNumber(int[] nums) {
        int arrSize = nums.length;
        for(int i=0; i<nums.length; i++){
            int numSize = nums[i];
            if(numSize < arrSize && i!=nums[i]){
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
                i--;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}