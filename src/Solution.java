
class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode root1 = new TreeNode(2);
        TreeNode root2 = new TreeNode(3);
        root.left = root1;
        root.right = root2;

        System.out.println(                new Solution().lowestCommonAncestor(root,root1,root).val);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null || p==null || q==null)return root;
        return         dfs(root,p,q);
    }
    TreeNode dfs (TreeNode head,TreeNode p ,TreeNode q){
        if (head == null) return null;

        TreeNode left = dfs(head.left ,p,q);
        TreeNode right = dfs(head.right,p,q);

        if (left!=null && right!=null) {
            return left;
        }
        if (p==head || q==head){
            if (left!=null||right!=null){
                    return p==head?p:q;
            }
            return head;
        }
        return left==null?right:left;
    }
}