class Solution {
    public void moveZeroes(int[] nums) {
        int i=-1;
        int j=0;
        while(j<nums.length){
            if(nums[j]!=0){
                i++;
                nums[i]=nums[j];
            }
            j++;
        }
        i++;
        while(i<nums.length){
            nums[i]=0;
            i++;
        }
    }
}