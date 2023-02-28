/**
 * 203. 移除链表元素
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点
 */
public class leetcode203 {
}
class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(val);
        temp.next = head;
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }
            else{temp = temp.next;
            }
        }
        return temp.next;
    }
}