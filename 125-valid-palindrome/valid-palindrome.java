class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        String str1 = str.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb = new StringBuilder();
        for(int i=str1.length()-1; i>=0; i--){
            sb.append(str1.charAt(i));
        }
        return str1.equals(sb.toString());
    }
}