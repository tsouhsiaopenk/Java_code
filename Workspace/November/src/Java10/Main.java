package Java10;

public class Main {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return helper(root.left,root.right);
    }

    private boolean helper(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null){
            return true;
        }
        if (r1 == null || r2 == null){
            return false;
        }
        return r1.val == r2.val && helper(r1.left,r2.right) && helper(r1.right,r2.left);
    }
}
