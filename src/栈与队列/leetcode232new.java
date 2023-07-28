package 栈与队列;

import java.util.Stack;

/**
 * @auther XMZ
 * @create 2023--20-下午3:26
 */
class MyQueue {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;
    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        changeStack();
       return stackOut.pop();
    }

    public int peek() {
        changeStack();
        return stackOut.peek();
    }

    public boolean empty() {
        return stackIn.isEmpty()&&stackOut.isEmpty();
    }
    // 弹出储存栈并将将其倒序入栈，弹出时便是队列操作
    public void changeStack(){
        if(!stackOut.empty()){
            return;
        }
        while (!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
public class leetcode232new {

}
