class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //1. I have to find the sum which is closest to the target 
        //2. For that we have to go with two pointer approach inside a loop that takes min tme complexity
        //3. After calculating sum we have to substract the sum to the target whatever value comes we have to convert to abs value and take lowest one.

        Arrays.sort(nums); int min=Integer.MAX_VALUE; int ans=0;
        for(int i=0; i<nums.length; i++){
            int j=i+1, k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                int sub=sum-target;
                if(Math.abs(sub)<min){
                    min=Math.abs(sub);
                    ans=sum;
                }
                if(sum>target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return ans;
    }
}