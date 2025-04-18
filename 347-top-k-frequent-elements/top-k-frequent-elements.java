class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        Set<Integer> keys = map.keySet();

        int max = 0;

        int i = 0; int ans[]=new int[k];

        while(k!=0){
            Integer keyInd = 0;
            for(Integer key : keys){
                if(map.get(key)>max){
                    max = map.get(key);
                    keyInd = key;
                }
            }
            k--;
            max = 0;
            ans[i]=keyInd;
            i++;
            map.remove(keyInd);
        }
        return ans;
    }
}