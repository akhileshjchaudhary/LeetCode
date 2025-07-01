class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }

        }

        Set<Integer> keys = map.keySet();

        int arr[]=new int[k]; int i = 0;

        int max = 0;
        while(k!=0){
            
            Integer indx = 0;
            for(Integer key : keys){
                 
                if(map.get(key)>max){
                    max = map.get(key);
                    indx = key;
                }
            }
            arr[i] = indx;
            i++;k--;
            map.remove(indx);
            max = 0;
        }
        return arr;
    }
}