package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrderNotCompleted(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        level(res, root, 0);
        return res;
    }

    private void level(List<List<Integer>> res,TreeNode root, int index){
        if (index >= res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(index).add(root.val);
        if (root.left != null) {
            level(res, root.left, index + 1);
        }
        if (root.right != null) {
            level(res, root.right, index + 1);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new LinkedList<>();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
                level.add(node.val);
            }
            ans.add(level);
        }
        return ans;
    }
}
