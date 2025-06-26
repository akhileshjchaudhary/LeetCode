class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t2);

        if(s1.length==t2.length){
            for(int i= 0; i<s1.length; i++){
                if(s1[i]!=t2[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}