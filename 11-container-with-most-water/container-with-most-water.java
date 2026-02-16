class Solution {
    public int maxArea(int[] nums) {
        //1.Iterate over height
        //2.Use two pointer
        //3. 1st point will on the oth element and 2nd pointer should be on last element
        //4. calculate the aea by last pointer index - first pointer index and then multiply it with minimum height
        //5. store the max area and return it at the last

        int start = 0, end = nums.length-1, max = 0;
        while(start < end){
            int minHeight = Math.min(nums[start], nums[end]);
            int area = (end - start) * minHeight;
            max = Math.max(max, area);
            if(nums[start] > nums[end]){
                end--;
            }else{
                start++;
            }
        }
        return max;
    }
}