class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        List<Character> list1=new ArrayList<>();
        List<Character> list2=new ArrayList<>();

        for(int i=0, j=0; i<s.length() && j<goal.length(); i++,j++){
            list1.add(s.charAt(i));
            list2.add(goal.charAt(j));
        }

        for(int i=0; i<list1.size(); i++){
            char ch=list1.removeFirst();
            list1.add(ch);
            if(list1.equals(list2)){
                return true;
            }
        }
        return false;
    }
}