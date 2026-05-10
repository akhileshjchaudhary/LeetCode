class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        long sum = 0, max = 0;
        int startIndx = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        if (!(map.size() < k)) {
            max = Math.max(max, sum);
        }

        for (int i = k; i < nums.length; i++) {
            if (map.get(nums[startIndx]) > 1) {
                map.put(nums[startIndx], map.get(nums[startIndx])-1);
            } else {
                map.remove(nums[startIndx]);
            }
            sum -= nums[startIndx];
            startIndx++;

            sum += nums[i];
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

            if (!(map.size() < k)) {
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}