package 力扣热题100;

import java.util.HashSet;
import java.util.List;

/**
 * @auther XMZ
 * @create 2023--25-12:17
 */

public class leetcode160 {
    // 普通方法是肯定可以做出来的，哈希集合
    // 你追我赶，我追你赶，很难想也很巧妙

    /*public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       if(headA == null || headB == null){
           return null;
       }
       ListNode preA = headA;
       ListNode preB = headB;
       while (preA != preB){
            preA = preA == null ? headB : preA.next;
            preB = preB == null ? headA : preB.next;
       }
       return preB;
    }

    public static void main(String[] args) {
        leetcode160 l16 = new leetcode160();
        System.out.println(l16.getIntersectionNode());
    }*/
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null ){
            return  null;
        }
        HashSet<ListNode> savetemp = new HashSet<>();
        while (headA != null){
            savetemp.add(headA);
            headA = headA.next;
        }
        while (headB != null){
            if(savetemp.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
