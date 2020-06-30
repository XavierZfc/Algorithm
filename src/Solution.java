
class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        if (issub(A,B)) return true;

        return isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }

    Boolean issub (TreeNode a , TreeNode b){

        if (b == null) return true;
        if (a == null || a.val != b.val) return false;

        return         issub(a.left,b.left) && issub(a.right,b.right) ;
    }
}