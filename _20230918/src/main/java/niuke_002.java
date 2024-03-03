public class niuke_002 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param head ListNode类 
     * @param m int整型 
     * @param n int整型 
     * @return ListNode类
     */
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

     public static void main(String[] args) {
         ListNode head = new ListNode(1);
         head.next = new ListNode(2);
         reverseBetween(head,1,2);
     }
}