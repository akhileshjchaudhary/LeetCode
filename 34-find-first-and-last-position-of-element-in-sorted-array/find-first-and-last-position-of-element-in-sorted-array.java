class Solution {
    public int[] searchRange(int[] nums, int target) {
        int si = 0; int ei = nums.length-1; int ans[]={-1, -1};

        if(nums.length == 1){

        }

        while(si<=ei){
            int mid = (si+ei)/2;
            if(nums[mid] == target){
                int i = mid-1;
                while(i>=0 && nums[i] == target){
                    ans[0] = i; i--;
                }
                int j = mid + 1;
                while(j<nums.length && nums[j] == target){
                    ans[1] = j; j++;
                }

                if(ans[0] == -1){
                    ans[0] = mid;
                }
                if(ans[1] == -1){
                    ans[1] = mid;
                }
                return ans;
            }

            if(target > nums[mid]){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return ans;
    }
}