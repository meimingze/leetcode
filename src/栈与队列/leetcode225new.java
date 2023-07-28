package 栈与队列;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @auther XMZ
 * @create 2023--20-下午3:52
 */
class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue2.offer(x);
        while (!queue1.isEmpty()){
            queue2.add(queue1.poll());
        }
        Queue<Integer> queueTemp = new LinkedList<>();
        queueTemp = queue1;
        queue1 = queue2;
        queue2 = queueTemp;
    }
    public int pop() {
        queue1.poll();
    }

    public int top() {
        queue1.peek();
    }

    public boolean empty() {

    }
}
public class leetcode225new {
}
