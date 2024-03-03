public class niuke_003 {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;//指向头节点
        ListNode cur = dummy.next;
        ListNode pre = dummy;
        for (int i = 0 ; i < m-1 ; i ++){
            pre = cur;
            cur = cur.next;
        }
        for(int i = m ; i  < n ; i ++){
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        return dummy.next;
    }
    public static ListNode reverseKGroup (ListNode head, int k) {
        // write code here
        ListNode cur = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        while (cur !=null){
            cur = cur.next;
            length ++;
        }
        for(int i = 0 ; i < length ; i +=k){
            if(i+k > length){
                break;
            }
//            head = reverseBetween(head,i+1,Math.min(i+k,length));
            head = reverseBetween(head,i+1,i+k);

        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next =new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        reverseKGroup(head,2);
    }
}
