import java.util.HashSet;

public class niuke_006 {

    // 空间不为 O（1）
    //    public boolean hasCycle(ListNode head) {
//        if (head == null || head.next == null) {
//            return false;
//        }
//
//        HashSet<ListNode> set = new HashSet<ListNode>();
//        while (head.next != null) {
//            if (set.contains(head)) {
//                return true;
//            }
//            set.add(head);
//            head = head.next;
//        }
//        return false;
//    }


    // 快慢指针
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null){
            slow = slow.next;
            if(fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            head = head.next;
            if(slow ==fast ){
                return  true;
            }
        }
        return false;
    }
}
