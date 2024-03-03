import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class niuke_012 {
    // 简单，但是时间空间都比较差
//    public ListNode sortInList (ListNode head) {
//        // write code here
//        ListNode cur = head;
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        while (cur != null){
//            arrayList.add(cur.val);
//            cur = cur.next;
//        }
//        Collections.sort(arrayList);
//        ListNode dummy = new ListNode(0);
//        ListNode res = dummy;
//        for(int i = 0 ; i < arrayList.size() ; i ++){
//            dummy.next = new ListNode(arrayList.get(i));
//            dummy = dummy.next;
//        }
//        return res.next;
//    }

    // 归并思想，快慢指针，将链表从mid 分成小部分。自底向上进行合并, 时间空间优化一些
    public static ListNode sortInList (ListNode head) {
        return merge(head);
    }

    public static ListNode merge ( ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = head;
        ListNode last = head.next;
        while (last != null && last.next != null){
            last = last.next.next;
            pre = pre.next;
        }
        last = pre.next;
        pre.next = null;
        ListNode left = merge(head);
        ListNode right = merge(last);
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        while (left != null  && right != null){
            if(left.val > right.val){
                dummy.next = right;
                right = right.next;
            }else {
                dummy.next = left;
                left  = left.next;
            }
            dummy = dummy.next;
        }
        if(left != null){
            dummy.next = left;
        }
        if(right != null){
            dummy.next = right;
        }
        return  res.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next  = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next  = new ListNode(4);
        head.next.next.next.next =  new ListNode(5);
        sortInList(head);
    }
}
