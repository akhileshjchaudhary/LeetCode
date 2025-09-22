class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        Set<Integer> key = map.keySet();

        int max = 0;
        for(Integer k : key){
           max = Math.max(max, map.get(k));
        }

        int sum = 0;

        for(Integer keys : key){
            if(map.get(keys)==max){
                sum = sum + map.get(keys);
            }
        }

        return sum;
    }
}