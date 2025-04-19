class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> mainList = new ArrayList<>();
        Set<List<Integer>> set =new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            int j=i+1; int k=nums.length-1;
            while(j<k){
                int ans = nums[i]+nums[j]+nums[k];
                if(ans==0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    set.add(list);
                    j++;k--;
                }else if(ans>0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        mainList.addAll(set);
        return mainList;
    }
}