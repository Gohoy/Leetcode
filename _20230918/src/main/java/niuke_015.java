public class niuke_015 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // write code here
        int target = head.val;
        ListNode temp = new ListNode(target);
        ListNode res = temp;
        while (head != null && head.val == target) {
            if (head.next != null && head.next.val != target) {
                temp.next = new ListNode(head.next.val);
                temp = temp.next;
                target = head.next.val;
            }
            head = head.next;
        }
        return res;
    }
}