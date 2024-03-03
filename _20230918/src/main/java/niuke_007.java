import java.util.ArrayList;
import java.util.List;

public class niuke_007 {
    // 这个获取环的长度可以，但是满
//     int getCycleLen(ListNode head) {
//         if(head == null || head.next == null){
//            return -1;
//        }
//        ListNode slow = head;
//        ListNode fast = head;
//        while(fast != null){
//            slow = slow.next;
//            if(fast.next == null) {
//                return -1;
//            }
//            fast = fast.next.next;
//            if(slow == fast ){
//                int length = 1;
//                slow =slow.next;
//                while (slow!= fast){
//                    slow = slow.next;
//                    length ++;
//                }
//                return length;
//
//            }
//        }
//        return -1;
//    }
//
//    public ListNode EntryNodeOfLoop(ListNode pHead) {
//
//        ListNode fast = pHead;
//        ListNode slow = pHead;
//        int length = getCycleLen(pHead);
//        if(length == -1){
//            return null;
//        }
//        for(int i = 0; i < length;  i++){
//            fast = fast.next;
//        }
//        while(slow != fast){
//            slow = slow.next;
//            fast = fast.next;
//        }
//        return slow;
//
//    }

    // 数学关系解题 判断有环之后，让fast 返回头，两个同时移动一个单位，相遇的地方就是环的起始点。
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = pHead;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;

    }

}
