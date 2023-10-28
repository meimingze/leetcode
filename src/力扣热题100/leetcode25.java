package 力扣热题100;

import java.util.List;

/**
 * @auther XMZ
 * @create 2023--28-10:27
 */
public class leetcode25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);//防止头节点的修改导致连接不上
        dummy.next = head;
        ListNode start = dummy;
        ListNode end = dummy;
        while (true){
            for(int i = 0; i < k && end!= null; i++ ){
                end = end.next;
            }
            if(end == null)     break;
            ListNode startNext = start.next;
            ListNode endNext = end.next;
            end.next = null;
            start.next = reverse(start.next);//更新头节点
            startNext.next = endNext;//反转后的尾节点重新连上后面的头节点
            start = end = startNext;//更新最新的位置（新的头节点的前一个）
        }
        return dummy.next;




    }
    public ListNode reverse(ListNode head){
        ListNode pre = head;
        ListNode temp = null;
        while(pre != null){
            ListNode next = pre.next;
            pre.next = temp;
            temp = pre;
            pre = next;
        }
        return temp;
    }

}
