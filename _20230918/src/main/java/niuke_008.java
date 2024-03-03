public class niuke_008 {
        //快慢指针，时间较长
    //    public ListNode FindKthToTail (ListNode pHead, int k) {
//        if(pHead == null) return null;
//        // write code here
//        ListNode fast = pHead;
//        ListNode slow = pHead;
//        for(int i = 0 ; i < k ; i ++){
//            fast = fast.next;
//            if(fast == null ) return  null;
//        }
//        while (fast != null){
//            fast = fast.next;
//            slow = slow.next;
//        }
//
//        return slow;
//    }

    // 链表的length - size个,比快慢指针还慢？为什么牛客哪些人提交速度极快
    public ListNode FindKthToTail (ListNode pHead, int k) {
        ListNode p  = pHead;
        if(p == null) return null;
        int size =  0 ;
        while (p.next != null){
            p = p.next;
            size++;
        }
        if(k > size ) return  null;
        for(int i = 0; i < size-k ; i ++){
            pHead = pHead.next;
        }
        return pHead;
    }
}
