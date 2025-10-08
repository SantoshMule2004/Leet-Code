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
class GoodNodes {
    private int count = 0;
    private void DFS(TreeNode curr, int maxVal) {
        if(curr == null)
            return;

        if(curr.val >= maxVal) {
            count += 1;
            maxVal = curr.val;
        }

        if(curr.left != null)
            DFS(curr.left, maxVal);

        if(curr.right != null)
            DFS(curr.right, maxVal);
    }

    public int goodNodes(TreeNode root) {
        DFS(root, root.val);
        return count;
    }
}