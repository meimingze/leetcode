package 栈与队列;

import java.util.Stack;

/**
 * @auther XMZ
 * @create 2023--10-下午2:39
 */
public class leetcode150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if("+".equals(s)){
                stack.push(stack.pop() + stack.pop());
            } else if ("-".equals(s)){
                stack.push(-stack.pop()+stack.pop());
            } else if("/".equals(s)){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 /temp1);
            } else if("*".equals(s)){
                stack.push(stack.pop()*stack.pop());
            } else {
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }
}
