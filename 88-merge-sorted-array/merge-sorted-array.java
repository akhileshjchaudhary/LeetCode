class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums[]=new int[m+n]; int i=0, j=0,k=0;
        for(;i<m && j<n;){
            if(nums1[i]<=nums2[j]){
                nums[k]=nums1[i];
                i++;k++;
            }else{
                nums[k]=nums2[j];
                j++;k++;
            }
        }
        while(i<m){
            nums[k++]=nums1[i++];
        }
        while(j<n){
            nums[k++]=nums2[j++];
        }
        
        //nums1=new int[m+n];
        for(int l=0; l<nums.length; l++){
            nums1[l]=nums[l];
        }
    }
}