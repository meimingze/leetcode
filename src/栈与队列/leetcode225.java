package 栈与队列;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @auther XMZ
 * @create 2023--10-下午1:29
 */
public class leetcode225 {
    class MyStack {
        Queue<Integer> quene1;
        Queue<Integer> quene2;
        public MyStack() {
            quene1 = new ArrayDeque<>();
            quene2 = new ArrayDeque<>();
        }

        public void push(int x) {
            while (quene1.size() > 0){
                quene2.add(quene1.poll());
            }
            quene1.add(x);
            while (quene2.size() > 0){
                quene1.add(quene2.poll());
            }
        }
        public int pop() {
            return  quene2.poll();
        }

        public int top() {
            return quene1.peek();
        }

        public boolean empty() {
            return quene1.isEmpty();
        }
    }
}
