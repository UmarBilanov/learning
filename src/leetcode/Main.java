package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        MiddleOfTheLinkedList middle = new MiddleOfTheLinkedList();
//        ListNode list = new ListNode(5);
//        list = new ListNode(4, list);
//        list = new ListNode(3, list);
//        list = new ListNode(2, list);
//        list = new ListNode(1, list);
//        System.out.println(list.val);
//        list = middle.middleNode(list);
//        System.out.println(list.val);

//        BestTimeToBuyAndSellStock sellStock = new BestTimeToBuyAndSellStock();
//        int i = sellStock.maxProfit(new int[]{7,1,5,3,6,4});
//        System.out.println(i);

//        LongestPalindrome longestPalindrome = new LongestPalindrome();
//        System.out.println(longestPalindrome.longestPalindrome("ABCDBCDA"));
//        1,null,3,2,4,null,5,6


//        List<Node> childNodeList2 = new ArrayList<>();
//        childNodeList2.add(0,new Node(5));
//        childNodeList2.add(1,new Node(6));
//        List<Node> childNodeList = new ArrayList<>();
//        childNodeList.add(0,new Node(3, childNodeList2));
//        childNodeList.add(1,new Node(2));
//        childNodeList.add(2,new Node(4));
//        Node node = new Node(1, childNodeList);
//        TreePreorderTraversal traversal = new TreePreorderTraversal();
//        List<Integer> res = traversal.preorder(node);
//        res.forEach(System.out::println);

//        TreeNode leftTreeNode = new TreeNode(9, new TreeNode(16), new TreeNode(8));
//        TreeNode rightTreeNode = new TreeNode(20, new TreeNode(15), new TreeNode(7));
//        TreeNode treeNode = new TreeNode(3, leftTreeNode, rightTreeNode);
//        BinaryTreeLevelOrderTraversal treeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
//        List<List<Integer>> res = treeLevelOrderTraversal.levelOrderNotCompleted(treeNode);
//        res.forEach(System.out::println);

        int[] arr = new int[]{1, 4, 6, 8, 9, 12, 19};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(arr, 9));
    }
}
