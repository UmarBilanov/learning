package leetcode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode res = null;
        while(head != null) {
            res = new ListNode(head.val, res);
            head = head.next;
        }
        return res;
    }

    public ListNode reverseList2(ListNode head) {
        return reverseListInt(head, null);
    }

    private ListNode reverseListInt(ListNode head, ListNode newHead) {
        if (head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
    }
}
