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
class PathSum {
    int count = 0;
    private void DFS(TreeNode curr, long targetSum) {
        if(curr == null)
            return;

        if(curr.val == targetSum)
            count += 1;

        DFS(curr.left, targetSum - curr.val);
        DFS(curr.right, targetSum - curr.val);
    }

    public int pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return 0;

        DFS(root, targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return count;
    }
}