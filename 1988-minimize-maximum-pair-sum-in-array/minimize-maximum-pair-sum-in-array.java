class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0,  j=nums.length-1,  max = 0;
        while(i<j){
            //1add first + last (element) 
            int sum = nums[i] + nums[j];
            max = Math.max(max, sum);
            i++; j--;
        }
        return max;
    }
}