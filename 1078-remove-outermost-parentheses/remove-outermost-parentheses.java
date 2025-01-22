class Solution {
    public String removeOuterParentheses(String s) {
        List<List<Character>> mainList=new ArrayList<>();
        List<Character> list=new ArrayList<>();
        int observer=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                observer++;
                list.add(s.charAt(i));
            }else if(s.charAt(i)==')'){
                observer--;
                list.add(s.charAt(i));
            }

            if(observer==0){
                mainList.add(new ArrayList<>(list));
                list.clear();
            }
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0; i<mainList.size(); i++){
            List<Character> newList=mainList.get(i);
            for(int j=1; j<newList.size()-1; j++){
                sb.append(newList.get(j));
            }
        }
        return sb.toString();
    }
}