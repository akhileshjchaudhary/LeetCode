class Solution {
    public int maxDepth(String s) {
        Stack<Character> s2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            s2.push(s.charAt(i));
        }

        int max = 0, count = 0;
        Stack<Character> temp = new Stack<>();

        // Process characters in original order (left to right)
        while (!s2.isEmpty()) {
            temp.push(s2.pop());
        }

        while (!temp.isEmpty()) {
            char ch = temp.pop();
            if (ch == '(') {
                count++;
                
            } else if (ch == ')') {
                max = Math.max(max, count);
                count--;
            }
        }

        return max;
    }
}
