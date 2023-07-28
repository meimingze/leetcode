package 栈与队列;

import java.util.Stack;

/**
 * @auther XMZ
 * @create 2023--07-下午3:39
 */
class MyQueue1 {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    public MyQueue1() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        dumpstackIn();
        return stackOut.pop();
    }

    public int peek() {
        dumpstackIn();
        return stackOut.peek();
    }

    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
    // 如果stackOut为空，那么将stackIn中的元素全部放到stackOut中
    private void dumpstackIn(){
        if(!stackOut.empty()){
            return;
        }
        while (!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }
    }
}
public class leetcode232 {
    public static void main(String[] args) {
        MyQueue my = new MyQueue();
        my.push(1);
        my.push(2);
        my.push(3);
        for(int i = 0; i < 3; i ++){
            System.out.println(my.pop());
        }

    }
}
