class Solution {
    public int maxDepth(String s) {
        Stack stack=new Stack(); int max=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i)==')'){
                stack.pop();
            }
            max=Math.max(max,stack.size());
        }
        return max;
    }
}