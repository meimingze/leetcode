package 栈与队列;

import java.util.Stack;

/**
 * @auther XMZ
 * @create 2023--10-下午2:12
 */
public class leetcode1047 {
    public String removeDuplicates(String s) {
        char news[] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c: news){
            if(stack.empty() || c != stack.peek()){
                stack.push(c);
            }else{
                stack.pop();
            }
        }
        StringBuffer res = new StringBuffer();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        res.reverse();
        return res.toString();
    }
}
