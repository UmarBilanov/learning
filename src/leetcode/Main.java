package leetcode;

public class Main {
    public static void main(String[] args) {
        MiddleOfTheLinkedList middle = new MiddleOfTheLinkedList();
        ListNode list = new ListNode(5);
        list = new ListNode(4, list);
        list = new ListNode(3, list);
        list = new ListNode(2, list);
        list = new ListNode(1, list);
        System.out.println(list.val);
        list = middle.middleNode(list);
        System.out.println(list.val);
    }
}
