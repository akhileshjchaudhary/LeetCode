class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums); boolean flag = true;
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                ans = i;
                flag = false;
                break;
            }
        }
        if(flag == false){
            return ans;
        }else{
            return nums.length;
        }
    }
}