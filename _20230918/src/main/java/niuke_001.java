public class niuke_001 {

//    public ListNode ReverseList (ListNode head) {
//        // write code here
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode head1 = new ListNode(head.val);
//        head = head.next;
//        while(head != null){
//            ListNode temp = head.next;
//            head.next = head1;
//            head1 = head;
//            head = temp;
//        }
//        return head1;
//    }


    //头插法
    public ListNode ReverseList(ListNode head) {

        ListNode pre = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }
}
