/**
 * 61. 旋转链表
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 *
 */
public class leetcode61 {
}
class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail = head;
        ListNode newtail = head;
        ListNode newhead;
        int remembernum = 1;
        if(head == null || head.next == null) return head;
        if(k <= 0){
            return head;
        }
        while(tail.next != null){
            tail = tail.next;
            remembernum++;
        }
        tail.next = head;
        for(int i = 0; i < (remembernum-1-(k%remembernum));i++){
            newtail = newtail.next;
        }
        newhead = newtail.next;
        newtail.next = null;
        return newhead;
    }
}