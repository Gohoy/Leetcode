public class niuke_009 {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        ListNode slow = new ListNode(1);
        ListNode dummy  = slow;
        slow.next = head;
        ListNode fast = head;
        for(int i = 0 ; i < n;  i ++){
            fast = fast.next;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next  = slow.next.next;
        return dummy.next;
    }
}
