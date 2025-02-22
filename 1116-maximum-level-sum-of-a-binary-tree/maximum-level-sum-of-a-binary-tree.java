/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int level = 0;
        int currentLevel = 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr == null) {
                level++;

                if (max < sum) {
                    max = sum;
                    currentLevel = level;
                }

                if(!q.isEmpty()){
                    q.add(null);
                }
                
                sum = 0;

            } else {
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
                sum = sum + curr.val;
            }
        }
        return currentLevel;
    }
}