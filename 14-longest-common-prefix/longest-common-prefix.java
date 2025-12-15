class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder(strs[0]);
        for(int i=1; i<strs.length; i++){
            StringBuilder newSb = new StringBuilder();
            int min = Math.min(strs[i].length(), sb.length());
            // for(int j=0; j<strs[i].length(); j++){
                for(int k=0; k<min; k++){
                    if(sb.charAt(k)==strs[i].charAt(k)){
                        newSb.append(sb.charAt(k));
                    }else{
                        break;
                    }
                }
            // }
            if(newSb.length()==0){
                return "";
            }else{
                sb = new StringBuilder(newSb);
            }
        }
        return sb.toString();
    }
}