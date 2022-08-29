package leetcode;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(l1.val + l2.val);
        while (l1.next.next == null && l2.next.next == null) {
            System.out.println("res val: " + res.val);
            l1 = l1.next;
            l2 = l2.next;
            res = new ListNode(l1.val + l2.val, res);
        }
        return res;
    }

    public static void main(String[] args) {
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

//Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.