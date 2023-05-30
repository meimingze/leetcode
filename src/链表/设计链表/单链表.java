package 链表.设计链表;

/**
 * @auther XMZ
 * @create 2023--06-下午3:20
 */

public class 单链表 {
    private Node head = null;
    private static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void addfirst(int value){
        // 2.链表非空
        head = new Node(value,head);
    }
}

