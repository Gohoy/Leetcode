public class niuke_004 {
    public static ListNode Merge (ListNode pHead1, ListNode pHead2) {
        if(pHead2 == null ){
            return pHead1;
        }
        if(pHead1 == null){
            return pHead2;
        }
        // write code here
        ListNode dummy1 = new ListNode(0);
        ListNode result =dummy1;
        while(pHead1 != null){
            if(pHead2 == null) {
                dummy1.next = pHead1;
                break;
            }
            if(pHead1.val <= pHead2.val){
                dummy1.next = pHead1;
                pHead1 = pHead1.next;
            }else {
                dummy1.next = pHead2;
                pHead2 = pHead2.next;
            }
            dummy1 = dummy1.next;
        }
        while (dummy1.next != null){
            dummy1 = dummy1.next;
        }
        dummy1.next = pHead2;
        return result.next;

    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(16);
        head1.next.next = new ListNode(17);
        ListNode head2 = new ListNode(16);
        head2.next = new ListNode(16);
        head2.next.next = new ListNode(16);
        ListNode merge = Merge(head1, head2);
    }
}
