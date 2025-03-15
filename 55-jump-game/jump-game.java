class Solution {
    public boolean canJump(int[] nums) {
        int target = nums.length-1;
        boolean flag = true;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]+i>=target){
                target = i;
                flag = true;
            }else{
                flag = false;
            }
        }
        return flag;
    }
}