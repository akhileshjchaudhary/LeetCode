class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, windowLength = 0, startIndx = 0, min = Integer.MAX_VALUE;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            windowLength++;

            while (sum >= target) {
                min = Math.min(min, windowLength);
                sum -= nums[startIndx];
                windowLength--;
                startIndx++;
                flag = true;
            }
        }
        if (!flag) {
            return 0;
        }
        System.out.println(sum);
        return min;
    }
}