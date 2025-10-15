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
class DeleteNode {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return root;

        if(root.val == key)
            return reArrange(root);

        TreeNode curr = root;
        while(curr != null) {
            if(curr.val < key) {
                if(curr.right != null && curr.right.val == key) {
                    curr.right = reArrange(curr.right);
                    break;
                } else {
                    curr = curr.right;
                }
            } else {
                if(curr.left != null && curr.left.val == key) {
                    curr.left = reArrange(curr.left);
                    break;
                } else {
                    curr = curr.left;
                }
            }
        }
        return root;
    }

    public TreeNode reArrange(TreeNode curr) {
        if(curr.left == null)
            return curr.right;
        else if(curr.right == null)
            return curr.left;
        else {
            // replacing key node with left child
            // TreeNode rightChild = curr.right;
            // TreeNode rightLeaf = findRightLeaf(curr.left);
            // rightLeaf.right = rightChild;
            // return curr.left;

            // replacing key node with right child
            TreeNode leftChild = curr.left;
            TreeNode leftLeaf = findLeftLeaf(curr.right);
            leftLeaf.left = leftChild;
            return curr.right;
        }
    }

    public TreeNode findLeftLeaf(TreeNode curr) {
        while(curr.left != null)
            curr = curr.left;

        return curr;
    }
}