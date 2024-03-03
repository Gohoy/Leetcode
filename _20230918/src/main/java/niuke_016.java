public class niuke_016 {
//    public ListNode deleteDuplicates (ListNode head) {
//        // write code here
//        if(head == null || head.next == null) {
//            return head;
//        }
//        int target = head.val;
//        boolean flag = false;
//
//        ListNode temp = new ListNode(1);
//        ListNode res = temp;
////        if(head.next.val != target){
////            temp.next = new ListNode(head.val) ;
////            temp = temp.next;
////        }
//        head = head.next;
//        while (head != null){
//            if(head.val == target){
//                flag = true;
//                head = head.next;
//                continue;
//            }
//            if(!flag ){
//                temp.next = new ListNode(target);
//                temp =temp.next;
//            }
//            flag = false;
//            target = head.val;
//            if( head.next == null){
//                if(temp.val != head.val){
//                    temp.next = new ListNode(head.val);
//                    temp = temp.next;
//                }
//            }
//
//            head = head.next;
//        }
//        return res.next;
//    }

    //当出现相同的元素的时候，直接让头指针指向第一个不同的元素，重新执行,优化也不大
    public ListNode deleteDuplicates (ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode p=head;
        while (p!=null&&p.next != null){
            if( p.val == p.next.val){
                while (p.next !=null && p.val == p.next.val){
                    p = p.next;
                }
                pre.next = p.next;
                p = p.next;
            }else {
                pre  = p ;
                p = p.next;
            }
        }
        return  dummy.next;
    }


}
