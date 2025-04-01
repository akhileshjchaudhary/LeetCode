/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        TreeNode leftRoot = root.left;
        TreeNode rightRoot = root.right;

        leftPart(leftRoot, leftList);
        rightPart(rightRoot, rightList);

        if (leftList.size() == rightList.size() && leftList.equals(rightList)) {
            return true;
        } else {
            return false;
        }
    }

    public void leftPart(TreeNode root, List<Integer> leftList) {
        if (root == null) {
            leftList.add(null);
            return;
        }
        leftList.add(root.val);
        leftPart(root.left, leftList);
        leftPart(root.right, leftList);
    }

    public void rightPart(TreeNode root, List<Integer> rightList) {
        if (root == null) {
            rightList.add(null);
            return;
        }
        rightList.add(root.val);
        rightPart(root.right, rightList);
        rightPart(root.left, rightList);
    }

}