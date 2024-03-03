public class niuke_010 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        while(pHead1 != null){
                ListNode temp2 = pHead2;
            while (temp2 != null){
                if(temp2 == pHead1){
                    return temp2;
                }else {
                    temp2 = temp2.next;
                }
            }
            pHead1 = pHead1.next;
        }
        return null;
    }
}
