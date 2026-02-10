package Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean left = true;
        while(!q.isEmpty()){
            int n = q.size();
            LinkedList<Integer> row = new LinkedList<>();
            for(int i=0; i<n; i++){
                TreeNode curr = q.poll();
                if (left)
                    row.addLast(curr.val);
                else
                    row.addFirst(curr.val);

                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            ans.add(row);
            left = !left;
        }
        return ans;
    }
}
