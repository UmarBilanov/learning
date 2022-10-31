package leetcode;

import java.util.ArrayList;
import java.util.List;

public class TreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        innerPreorder(res, root);
        return res;
    }

    private void innerPreorder(List<Integer> res, Node root) {
        if (root == null) return;
        System.out.println("root val: " + root.val);
        res.add(root.val);
        if (root.children != null) {
            for (int i = 0; i < root.children.size(); i++) {
                innerPreorder(res, root.children.get(i));
            }
        }
    }

}
