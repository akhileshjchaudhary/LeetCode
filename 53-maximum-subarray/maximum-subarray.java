class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0; int max1 = Integer.MIN_VALUE; int max = Integer.MIN_VALUE;

        if(nums.length == 1){
            return nums[0];
        }

        boolean flag = false;
        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
            if(nums[i]>=0){
                flag = true;
                break;
            }
        }

        if(flag == true){
            max = Integer.MIN_VALUE;
        }else{
            return max;
        }

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            if(sum<0){
                sum = 0;
            }
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }
}