package 二叉树.前中后序遍历_广度遍历;
import java.util.*;

/**
 * @auther XMZ
 * @create 2023--07-下午2:49
 */
public class Treenode {
    public static class Node{
        public int val;
        public Node left;
        public Node right;
        public Node(int val){
            this.val = val;
        }
        // 递归序
        public static void f(Node head){
            // 1
            if(head == null){
                return;
            }
            //1
            f(head.left);
            //2
            f(head.right);
            //3
    }
    // 先序遍历
    public static void preOrderRecur(Node head){
        if(head == null){
            return;
        }
        System.out.println(head.val + " ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }
    // 中序遍历
    public static void inOrderRecur(Node head){
        if(head == null){
            return;
        }
        inOrderRecur(head.left);
        System.out.println(head.val + " ");
        inOrderRecur(head.right);
    }
    // 后序遍历

    public static void preOrderUnRecur(Node head){
        if(head == null){
            return;
        }
        preOrderRecur(head.left);
        preOrderRecur(head.right);
        System.out.println(head.val + " ");
    }
    // 使用栈的方式实现前序遍历
    public static void preOrderUnReCur_Stack(Node head){
        System.out.println("pre-order");
        if(head != null){
            Stack<Node> stack = new Stack<Node>();
            stack.add(head);
            while (!stack.isEmpty()){
                head = stack.pop();
                System.out.println(head.val + " ");
                if(head != null){
                    stack.push(head.right);
                }
                if(head != null){
                    stack.push(head.left);
                }
            }
        }
    }
    // 使用栈的方法实现后序遍历
    public static void posOrderUnRecur1(Node head){
        System.out.println("pos_order:");
        if(head != null){
            Stack<Node> s1 = new Stack<Node>();
            Stack<Node> s2 = new Stack<Node>(); // 收集栈
            s1.push(head);
            while (!s1.isEmpty()){
                head = s1.pop();
                s2.push(head);
                if(head.left != null){
                    s1.push(head.left);
                }
                if(head.right != null){
                    s1.push(head.right);
                }
            }
            while(!s2.isEmpty()){
                System.out.println(s2.pop().val + " ");
            }
        }
    }
    public static void posOrderMidRecur1(Node head){

    }
    // 广度优先遍历
    public static void wide(Node head){
        if(head == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(head);
        HashMap<Node,Integer> levelmap = new HashMap<>();
        levelmap.put(head,1);
        int curLevel = 1;
        int curLevelNodes = 0;
        int max = Integer.MIN_VALUE;
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            int curNodeLevel = levelmap.get(cur);
            if(curNodeLevel == curLevel){
                curLevelNodes++;
            }else{
                max = Math.max(max,curLevelNodes);
                curLevel++;
                curLevelNodes = 0;
            }
            System.out.println(cur.val);
            if(cur.left != null){
                queue.add(cur.left);
            }
            if(cur.right != null){
                queue.add(cur.right);
            }
        }
    }

    }
}





