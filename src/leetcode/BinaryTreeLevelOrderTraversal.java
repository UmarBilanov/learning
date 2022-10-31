package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> innerRes = new ArrayList<>();
        innerRes.add(root.val);
        if (root.left != null) {
            innerLevelOrder(res, root.left);
        }
        if (root.right != null) {
            innerLevelOrder(res, root.right);
        }
        res.add(innerRes);
        return res;
    }

    private void innerLevelOrder(List<List<Integer>> res,TreeNode root){
        List<Integer> innerRes = new ArrayList<>();
        if (root.left != null) {
            innerRes.add(root.left.val);
            innerLevelOrder(res, root.left);
        }
        if (root.right != null) {
            innerRes.add(root.right.val);
            innerLevelOrder(res, root.right);
        }
        res.add(innerRes);
    }
}
