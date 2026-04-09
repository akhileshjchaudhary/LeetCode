class Solution {
    public int removeDuplicates(int[] nums) {
        int lastVal=nums[0];
        int i=0, currIndx=1, count=1; 
        while(currIndx<nums.length && i<nums.length){
            int currVal=nums[currIndx];
            if(lastVal==currVal && count<3){
                count++;
            }else if(lastVal!=currVal){
                if(count>=2){
                    i++;
                    nums[i]=lastVal;
                }
                lastVal=currVal;
                i++;
                nums[i]=lastVal;
                count=1;
                // nums[i]=nums[currVal];
            }
            currIndx++;
        }
        if(count>=2){
            i++;
            nums[i]=lastVal;
        }
        return i+1; 
    }
}