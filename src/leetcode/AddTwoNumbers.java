package leetcode;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        System.out.println("res val: " + res.val);
        while (l1.next != null && l2.next != null) {
            System.out.println("res val: " + res.val);
            res = new ListNode(l1.val + l2.val, res);
            l1 = l1.next;
            l2 = l2.next;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] il1 = {2, 4, 3};
        int[] il2 = {5, 6, 4};
        ListNode l1 = new ListNode(il1[0]);
        ListNode l2 = new ListNode(il2[0]);
        for (int i = 1; i < 3; i++) {
            l1 = new ListNode(il1[i], l1);
            l2 = new ListNode(il2[i], l2);
        }

        addTwoNumbers(l1, l2);
    }
}


//Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.