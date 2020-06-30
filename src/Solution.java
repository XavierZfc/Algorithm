
class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        mirror(root);
        return root;
    }
    void mirror (TreeNode root) {
        if (root == null) return;
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;

        mirror(root.right);
        mirror(root.left);
    }
}