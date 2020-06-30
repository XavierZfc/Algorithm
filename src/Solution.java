import java.util.HashMap;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static void main(String[] args) {
        new Solution().levelOrder(new TreeNode(1));
    }
    HashMap<Integer,Integer> hashMap = new HashMap<>();
    int n = 0 ;
    public int[] levelOrder(TreeNode root) {
        if(root == null){
            return null ;
        }
        dfs(root);
        int m = n;
        int[] arr = new int[m];
        for(int a=0 ;a<=n ;a++){
            System.out.println(n);
            arr[a] = (int)hashMap.get(a);
        }
        return arr;
    }

    void dfs(TreeNode root ){
        if(root == null) return;
            hashMap.put(n++,root.val);
        dfs(root.left);
        dfs(root.right);

    }
}