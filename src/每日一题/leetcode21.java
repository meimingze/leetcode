package 每日一题;

import java.util.List;
import java.util.function.Predicate;

/**
 * @auther XMZ
 * @create 2023--05-上午9:55
 */
class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode (int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class leetcode21 {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode prev = new ListNode(-1);
//        ListNode prehead = prev;
//        while(list2 != null && list1 != null){
//            if(list1.val <= list2.val){
//                prehead.next = list1;
//                list1 = list1.next;
//            }else{
//                prehead.next = list2;
//                list2 = list2.next;
//            }
//            prehead = prehead.next;
//        }
//        prehead.next = list1 == null ? list2 : list1;
//        return prev.next;
//    }
    //递归
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val <= list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }
        if(list1.val > list2.val){
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
        return list1;
    }

}