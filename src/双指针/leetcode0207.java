package 双指针;

/**
 * @auther XMZ
 * @create 2023--05-下午4:32
 */
public class leetcode0207 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode fast = headA;
        ListNode slow = headB;
        int lenA = 0;
        int lenB = 0;
        while(fast != null){
            lenA++;
            fast = fast.next;
        }
        while(slow != null){
            lenB++;
            slow = slow.next;
        }
        if(lenB > lenA){
            int temp = 0;
            temp = lenA;
            lenA = lenB;
            lenB = temp;
            ListNode tempNode;
            tempNode = headA;
            headA = headB;
            headB = tempNode;
        }
        fast = headA;
        slow = headB;
        int n = lenA - lenB;
        for(int i  = 0; i< n; i++){
            fast = fast.next;
        }
        while (fast != null){
            if(fast == slow){
                return fast;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return null;
    }
}
