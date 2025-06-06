class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map=new HashMap<>();
        if(s.length()==t.length()){
            for(int i=0; i<s.length(); i++){
                if(map.containsKey(s.charAt(i))){
                    if(map.get(s.charAt(i))!=t.charAt(i)){
                        return false;
                    }
                }else{
                    map.put(s.charAt(i),t.charAt(i));
                }
            }
        }

        HashMap<Character,Character> map1=new HashMap<>();
        if(s.length()==t.length()){
            for(int i=0; i<t.length(); i++){
                if(map1.containsKey(t.charAt(i))){
                    if(map1.get(t.charAt(i))!=s.charAt(i)){
                        return false;
                    }
                }else{
                    map1.put(t.charAt(i),s.charAt(i));
                }
            }
        }
        return true;
    }
}