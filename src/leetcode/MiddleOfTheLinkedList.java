package leetcode;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode temp = null;
        int count = 0;
        while(head != null) {
            temp = new ListNode(head.val, temp);
            head = head.next;
            count++;
        }
        count = (count + 1)/2;
        System.out.println(count);
        while (count>0) {
            head = new ListNode(temp.val, head);
            temp = temp.next;
            count -= 1;
        }
        return head;
    }

    public ListNode middleNode2(ListNode head){
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
