class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] f=s.toCharArray();
        char[] n=t.toCharArray();
        Arrays.sort(f);
        Arrays.sort(n);
        if(s.length()==t.length()){
            for(int i=0; i<s.length(); i++){
                if(f[i]!=n[i]){
                    return false;
                }
            }
        }
        return true;
    }
}