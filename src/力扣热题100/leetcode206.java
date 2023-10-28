package 力扣热题100;

/**
 * @auther XMZ
 * @create 2023--27-13:39
 */
public class leetcode206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = head;
        ListNode temp = null;
        while (pre != null){
            ListNode oo = pre.next;
            pre.next = temp;
            temp = pre;
            pre = oo;
        }
        return  temp;
    }
}
