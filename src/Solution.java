
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null || q==null || p==null) return null;
        if (p.val > q.val) {
            return dfs(root,q.val,p.val);
        }else
            return dfs(root,p.val,q.val);
    }
    TreeNode dfs (TreeNode root ,int p ,int q){
        if (root == null) return null;

        TreeNode left =null,right=null;

        if (p>=root.val) right = dfs(root.right,p,q);
        else if (q<=root.val){
            left = dfs(root.left,p,q);
        }else {
            return root;
        }
        return left==null?right:left;
    }

}