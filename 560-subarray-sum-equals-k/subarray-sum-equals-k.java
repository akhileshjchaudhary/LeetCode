class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum[] = new int[nums.length];
        prefixSum[0] = nums[0];
        for(int i=1; i<prefixSum.length; i++){
            prefixSum[i] = nums[i] + prefixSum[i-1];
        }

        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<prefixSum.length; i++){
            if(prefixSum[i]==k){
                count++;
            }
            int val = prefixSum[i] - k;
            if(map.containsKey(val)){
                count = count + map.get(val);
            }
             if(map.containsKey(prefixSum[i])){
                map.put(prefixSum[i], map.get(prefixSum[i])+1);
            }else{
                map.put(prefixSum[i], 1);
            }
        }
        return count;
    }
}