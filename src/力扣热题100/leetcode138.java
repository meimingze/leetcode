package 力扣热题100;

import org.w3c.dom.Node;

/**
 * @auther XMZ
 * @create 2023--29-17:17
 */

public class leetcode138 {
    private class Node{
        int val;
        Node next;
        Node random;
        public Node(int val){
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    //看似很复杂，使用迭代的话只有random这个变量是难处理的
    public Node copyRandomList(Node head) {
        for(Node node = head; node != null; node = node.next.next){
            Node newNode = new Node(node.val);
            newNode.next = node.next;
            node.next = newNode;
        }
        for(Node node = head; node != null; node = node.next.next){
            Node newNode = node.next; //第一次遍历的复制节点
            newNode.random = (node.random == null) ? null : node.random.next;
            // 复制random节点
        }
        // 找到新的头节点并断开原node
        Node newhead = head.next;
        for(Node node = head; node != null; node = node.next.next){
            Node newNode = node.next;
            node.next = newNode.next.next;
            newNode.next = (newNode.next != null) ? newNode.next.next : null;
        }
        return newhead;
    }
}
