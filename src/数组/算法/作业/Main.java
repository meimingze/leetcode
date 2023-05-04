package 数组.算法.作业;
import java.util.Scanner;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
class LinkedList {
    ListNode head;
    // 插入节点，保持递增顺序
    public void insert(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null || head.val > val) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode cur = head;
            while (cur.next != null && cur.next.val < val) {
                cur = cur.next;
            }
            newNode.next = cur.next;
            cur.next = newNode;
        }
    }

    // 就地逆置
    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }
        ListNode prev = null, cur = head, next = head.next;
        while (next != null) {
            cur.next = prev;
            prev = cur;
            cur = next;
            next = next.next;
        }
        cur.next = prev;
        head = cur;
    }
    // 销毁链表
    public void destroy() {
        head = null;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList list = new LinkedList();
        for (int i = 0; i < n; i++) {
            list.insert(scanner.nextInt());
        }

        // 打印递增排序序列
        ListNode cur = list.head;
        while (cur != null) {
            System.out.print(cur.val);
            if (cur.next != null) {
                System.out.print("->");
            }
            cur = cur.next;
        }
        System.out.println();

        // 打印反序序列
        list.reverse();
        cur = list.head;
        while (cur != null) {
            System.out.print(cur.val);
            if (cur.next != null) {
                System.out.print("->");
            }
            cur = cur.next;
        }
        System.out.println();

        list.destroy();
    }
}
