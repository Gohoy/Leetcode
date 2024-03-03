public class niuke_013 {
    // 反转链表，遍历
    // 优化：反转后半段链表，同时遍历
    public static boolean  isPail (ListNode head) {
        // write code here
        ListNode head1 = head;
        ListNode res = reverse(head1);
        while (head != null){
            if(res.val != head.val) return false;
            head = head.next;
            res = res.next;
        }
        return true;
    }
    public static ListNode reverse (ListNode head){
        if(head== null || head.next == null){
            return head;
        }
        ListNode dummy = null;
        while (head != null){
           ListNode temp = new ListNode(head.val);
           temp.next  =dummy;
            dummy = temp;
            head = head.next;
        }
        return dummy;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next.next.next.next = new ListNode(1);
        System.out.println(isPail(head));

    }

}
