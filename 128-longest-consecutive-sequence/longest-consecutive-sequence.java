class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int max = 0; int count = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            if(nums[i-1]+1==nums[i]){
                count++;
                max = Math.max(max,count);
            }else{
                count = 0;
            }
        }
        return max+1;
    }
}