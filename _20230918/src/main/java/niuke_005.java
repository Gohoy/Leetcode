import java.util.ArrayList;

public class niuke_005 {
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
    //超时
//    public static ListNode mergeKLists (ArrayList<ListNode> lists) {
//        // write code here
//        ListNode temp ,s1, s2;
//        s1 = lists.get(0);
//        s2 = lists.get(1);
//        for(int i = 1 ; i < lists.size() ; i ++){
//            temp = Merge(s1 , s2);
//            s2 =temp;
//            s1 =s2;
//        }
//        return s2;
//    }

    public static ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists.isEmpty()) {
            return null;
        }
        return mergeLists(lists, 0, lists.size() - 1);
    }

    private static ListNode mergeLists(ArrayList<ListNode> lists, int start, int end) {
        if (start == end) {
            return lists.get(start);
        }
        int mid = (start + end) / 2;
        ListNode left = mergeLists(lists, start, mid);
        ListNode right = mergeLists(lists, mid + 1, end);
        return Merge(left, right);
    }


}
