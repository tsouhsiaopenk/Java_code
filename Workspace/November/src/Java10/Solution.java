package Java10;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

/**
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像
 */
class Solution {
    // 拿出每一个节点，交换其左右节点
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;

        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
