class Solution {
    public List<List<String>> groupAnagrams(String[] nums) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){

            String currStr = nums[i];
            char[] chr = currStr.toCharArray();
            Arrays.sort(chr);
            String sortedStr = new String(chr);

            if(map.containsKey(sortedStr)){
                map.get(sortedStr).add(currStr);
            }else{
                List<String> listStr = new ArrayList<>();
                listStr.add(currStr);
                map.put(sortedStr, listStr);
            }
        }
        return new ArrayList<>(map.values());
    }
}