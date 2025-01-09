class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pList=new ArrayList<>();
        List<Integer> nList=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=0){
                pList.add(nums[i]);
            }else{
                nList.add(nums[i]);
            }
        }
        for(int i=0; i<pList.size(); i++){
            System.out.println(pList.get(i) );
            System.out.println(nList.get(i) );
        }
        int arr[]=new int[nums.length];
        
        for(int i=0,k=0; i<pList.size() && k<arr.length; i++, k=k+2){
            arr[k]=pList.get(i);
        }
        for(int i=0, k=1; i<nList.size() && k<arr.length; i++, k=k+2){
            arr[k]=nList.get(i);
        }
        return arr;
    }
}