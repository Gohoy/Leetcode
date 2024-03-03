import java.math.BigDecimal;
import java.util.ArrayList;

public class niuke_011 {
    // 超时，直接进行转bigdecimal计算不行
//    public ListNode addInList (ListNode head1, ListNode head2) {
//        // write code here
//        BigDecimal sum1 = new BigDecimal(0);
//        BigDecimal sum2 = new BigDecimal(0);
//        while (head1 != null){
//            sum1 = sum1.multiply(new BigDecimal(10)).add(new BigDecimal(head1.val));
//            head1= head1.next;
//        }
//        while (head2!=null){
//            sum2 = sum2.multiply(new BigDecimal(10)).add(new BigDecimal(head2.val));
//            head2 = head2.next;
//        }
//        BigDecimal sum = sum1.add(sum2);
//        char[] chars = String.valueOf(sum).toCharArray();
//        ListNode dummy = new ListNode(0);
//        ListNode res = dummy;
//        for (char aChar : chars) {
//            dummy.next = new ListNode(Integer.parseInt(String.valueOf(aChar)));
//            dummy = dummy.next;
//        }
//        return res.next;
//    }

    // 反转加和 再反转
    public static ListNode addInList(ListNode head1, ListNode head2) {
        ListNode head1Rev = reverse(head1);
        ListNode head2Rev = reverse(head2);
        ListNode resRev = new ListNode(0);
        ListNode resHead = resRev;
        int flag = 0;
        while (head1Rev != null) {
            if (head2Rev == null) {
                while (head1Rev!=null){
                    int sum1 = head1Rev.val + flag;
                    flag = sum1/10;
                    resRev.next = new ListNode(sum1%10);
                    resRev = resRev.next;
                    head1Rev = head1Rev.next;
                }
                break;
            }
            int head1Val = head1Rev.val;
            int head2Val = head2Rev.val;
            int sum = head1Val + head2Val + flag;
            flag = sum / 10;
            resRev.next = new ListNode(sum % 10);
            resRev = resRev.next;
            head1Rev = head1Rev.next;
            head2Rev = head2Rev.next;

        }
         while (head2Rev != null) {
            int sum2 = head2Rev.val + flag;
            flag = sum2/10;
            resRev.next = new ListNode(sum2%10);
            resRev = resRev.next;
            head2Rev = head2Rev.next;
        }
        if(flag == 1){
            resRev.next = new ListNode(1);
        }
        return  reverse(resHead.next);
    }

    public static ListNode reverse(ListNode head) {

        ListNode pre = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(9);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(7);
        ListNode head2 = new ListNode(6);
        head2.next = new ListNode(3);
        addInList(head1,head2);
    }
}
