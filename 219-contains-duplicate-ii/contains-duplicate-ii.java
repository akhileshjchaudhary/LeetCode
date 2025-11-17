class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int j = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[j]);
                j++;
            }
        }
        return false;
    }
}