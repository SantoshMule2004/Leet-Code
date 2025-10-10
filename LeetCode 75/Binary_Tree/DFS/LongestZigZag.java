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
class LongestZigZag {
    private int maxLen = 0;
    private void DFS(TreeNode curr, boolean isLeft, int depth) {
        if(curr == null)
            return;

        maxLen = Math.max(maxLen, depth);
        DFS(curr.left, true, isLeft ? 1 : depth + 1);
        DFS(curr.right, false, isLeft ? depth + 1 : 1);
    }
    
    public int longestZigZag(TreeNode root) {
        if(root == null)
            return 0;
        
        DFS(root.left, true, 1);
        DFS(root.right, false, 1);
        return maxLen;
    }
}