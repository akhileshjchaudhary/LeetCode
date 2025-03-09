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
    public TreeNode deleteNode(TreeNode root, int key) {
        List<Integer> list = new ArrayList<>();
        levelOrderTraversal(root, list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                list.remove(i);
            }
        }
        return buildBST(list);
    }

    private void levelOrderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            list.add(curr.val);
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
    }

    private TreeNode buildBST(List<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }
        TreeNode root = new TreeNode(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            root = buildBSTHelper(root, list.get(i));
        }
        return root;
    }

    private TreeNode buildBSTHelper(TreeNode root, int val) {
        // if(val==null){
        // return null;
        // }
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        if (val < root.val) {
            root.left = buildBSTHelper(root.left, val);
        } else {
            root.right = buildBSTHelper(root.right, val);
        }
        return root;
    }
}