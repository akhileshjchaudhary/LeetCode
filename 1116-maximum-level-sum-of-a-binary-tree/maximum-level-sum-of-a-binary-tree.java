import java.util.*;

class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root == null) return 0; // Edge case: Empty tree

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int level = 0, currentLevel = 1; // Start from level 1

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr == null) {
                level++; // Move to the next level

                if (sum > max) { // Update max sum and corresponding level
                    max = sum;
                    currentLevel = level;
                }

                if (!q.isEmpty()) {
                    q.add(null);
                    sum = 0;
                }
            } else {
                sum += curr.val;
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
        return currentLevel;
    }
}
