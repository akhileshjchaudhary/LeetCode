class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0, avg=0, max=Integer.MIN_VALUE; int i=0;
        for(int j=0; j<k; j++){
            sum += nums[j];
        }
        avg=sum/k;
        System.out.println(avg);
        max=Math.max(max,avg);
        int j=k;
        for( ; j<nums.length; ){
            sum=sum-nums[i];
            i++;

            sum=sum+nums[j];
            j++;

            max=Math.max(max, (sum/k));
        }
        return max;
    }
}