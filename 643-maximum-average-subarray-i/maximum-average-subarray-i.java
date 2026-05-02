class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0, avg=0, max=Integer.MIN_VALUE;
        for(int j=0; j<k; j++){
            sum += nums[j];
        }
        max=sum;
        int j=k;
        for( ; j<nums.length; ){
            sum=sum-nums[j-k]+nums[j];
            j++;

            max=Math.max(max, sum);
        }
        return max/k;
    }
}