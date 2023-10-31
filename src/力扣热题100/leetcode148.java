package 力扣热题100;

import java.util.List;

/**
 * @auther XMZ
 * @create 2023--30-15:46
 */
public class leetcode148 {
    // 首先使用分治算法，将整个链表通过二分的方式，分成两个一组的节点，比较这两个节点，并进行合并
    //所以第一步为先拆分，第二步为找到合并的算法方式
    public ListNode sortList(ListNode head) {
        sortList(head, null);

    }
    public ListNode sortList(ListNode head, ListNode tail){
        if(head == tail){
            return head;
        }
        if(head.next == tail){
            head.next = null;
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != tail){
            slow = slow.next;
            fast = fast.next;
            if(fast != tail){
                fast = fast.next;
            }
        }
        ListNode mid = slow;
        ListNode list1 = sortList(head, mid);
        ListNode list2 = sortList(mid, tail);
        return merge(list2,list1);



    }
    public ListNode merge(ListNode head1, ListNode head2){
        ListNode dummyhead = new ListNode(0);
        ListNode temp = dummyhead, temp1 = head1, temp2 = head2;
        while (temp1 != null && temp2 != null){
            if(temp1.val > temp2.val){
                temp.next = temp2;
                temp2 = temp2.next;
                temp = temp.next;
            }
            if(temp1.val < temp2.val){
                temp.next = temp1;
                temp1 = temp1.next;
                temp = temp.next;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(temp1 != null){
            temp.next = temp1;
        }
        if(temp2 != null ){
            temp.next = temp2;
        }
        return dummyhead.next;
    }
}
