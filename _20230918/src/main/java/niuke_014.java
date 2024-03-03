public class niuke_014 {
    public ListNode oddEvenList (ListNode head) {
        // write code here
        ListNode head1 = new ListNode(-1); // 奇数
        ListNode head2  = new ListNode(-2); // 偶数
        ListNode head11 = head1;
        ListNode head22 = head2;
        int count = 0;
        while (head != null){
            if(count %2 != 0){
                head2.next = new ListNode(head.val);
                head2 = head2.next;
                count ++;
            }else {
                head1.next = new ListNode(head.val);
                head1 = head1.next;
                count++;
            }
            head = head.next;
        }
        head1.next = head22.next;
        return head11.next;
    }
}
