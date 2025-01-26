class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] f=s.toCharArray();
        char[] n=t.toCharArray();
        Arrays.sort(f);
        Arrays.sort(n);
        if(Arrays.equals(f,n)){
            return true;
        }else{
            return false;
        }
    }
}