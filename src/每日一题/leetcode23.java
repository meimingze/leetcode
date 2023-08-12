package 每日一题;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @auther XMZ
 * @create 2023--12-上午11:13
 * 分治算法可以降低这道问题的时间复杂度
 *
 */
public class leetcode23 {
    public ListNode mergerTwoList(ListNode a,ListNode b){
        if(a == null || b == null){
            return a == null ? a : b;
        }
        ListNode head = new ListNode(0);
        ListNode tail = head, aPre = a, bPre = b;
        while (aPre != null && bPre != null){
            if(aPre.val < bPre.val){
                tail.next = aPre;
                aPre = aPre.next;
            }else{
                tail.next = bPre;
                bPre = bPre.next;
            }
            tail = tail.next;
        }
        tail.next = (aPre != null ? aPre : bPre);
        return head.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;
        for(int i = 0; i < lists.length ; i++){
            res = mergerTwoList(res,lists[i]);
        }
        return res;
    }
}
