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
class LeafSimilar {
    private void DFS(TreeNode root, List<Integer> v) {
        if(root == null) return;

        if(root.left == null && root.right == null) {
            v.add(root.val);
            return;
        }
        DFS(root.left, v);
        DFS(root.right, v);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> v1 = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();
        DFS(root1, v1);
        DFS(root2, v2);

        return v1.equals(v2);
    }
}