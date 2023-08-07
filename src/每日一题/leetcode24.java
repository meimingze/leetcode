package 每日一题;

import java.util.List;

/**
 * @auther XMZ
 * @create 2023--05-上午11:23
 */
public class leetcode24 {
    public ListNode swapPairs(ListNode head) {
        ListNode prehead = new ListNode(0);
        prehead.next = head;
        ListNode temp = prehead;
        while (temp.next != null && temp.next.next != null){ // 若为偶数个，则temp.next == null时结束，若为奇数个，则temp.next.next时结束
            ListNode start = temp.next;  // 1
            ListNode end = temp.next.next; // 2
            temp.next = end; // newhead = 2
            start.next = end.next; // 2.next = 1.next
            end.next = start; //
            temp = start; // 重置temp，否则无法正确循环

        }
        return prehead.next;

    }
}
