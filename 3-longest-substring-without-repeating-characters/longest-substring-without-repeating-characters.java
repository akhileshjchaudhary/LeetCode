class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>(); int max = 0;
        for(int i= 0; i<s.length(); i++){
            if(list.contains(s.charAt(i))){
                int index = list.indexOf(s.charAt(i));
                for(int j=0; j<=index; j++){
                    list.remove(0);
                }
                list.add(s.charAt(i));
                max = Math.max(max, list.size());
            }else{
                list.add(s.charAt(i));
                max = Math.max(max, list.size());
            }
        }
        return max;
    }
}