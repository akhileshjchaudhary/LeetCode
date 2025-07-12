class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i=0, max = 0;
        for(int j=0; j<s.length(); j++){
            if(set.contains(s.charAt(j))){
                while(set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                    i++;
                }
            }
            set.add(s.charAt(j));
            max = Math.max(max, set.size());
        }
        return max;
    }
}