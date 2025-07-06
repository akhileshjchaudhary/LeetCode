class Solution {
    public int longestConsecutive(int[] nums) {
        int n=0, m=1;
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }
        boolean flag=false;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]!=nums[i+1]){
                flag = true;
            }
        }
        if(flag==false){
            return 1;
        }
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) { continue; }
            if (nums[i] != nums[i + 1]) {
                if (nums[i + 1] == nums[i] + 1) {
                    count++;
                    max = Math.max(max, count);
                }
                if (nums[i + 1] != nums[i] + 1) {
                    max = Math.max(max, count);
                    count = 1;
                }
            }

        }
        return max;
    }
}