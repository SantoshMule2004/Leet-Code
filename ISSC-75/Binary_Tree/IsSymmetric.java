package Binary_Tree;


public class IsSymmetric {
    private boolean isSameTree(TreeNode leftNode, TreeNode rightNode) {
        if(leftNode == null && rightNode == null)
            return true;

        if(leftNode == null || rightNode == null || leftNode.val != rightNode.val)
            return false;

        return (isSameTree(leftNode.left, rightNode.right) && isSameTree(leftNode.right, rightNode.left));
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;

        return isSameTree(root.left, root.right);
    }
}
