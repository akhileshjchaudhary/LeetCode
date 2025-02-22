class Solution {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        sumOfLeftLeavesRight(root, false);
        return sum;
    }

    private void sumOfLeftLeavesRight(TreeNode root, boolean flag) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null && flag) {
            sum += root.val;
        }
        sumOfLeftLeavesRight(root.left, true);
        sumOfLeftLeavesRight(root.right, false);
    }
}
