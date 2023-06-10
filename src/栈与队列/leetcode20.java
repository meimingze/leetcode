package 栈与队列;

import java.util.Stack;

/**
 * @auther XMZ
 * @create 2023--10-下午1:52
 */
public class leetcode20 {
    public boolean isValid(String s) {
        char news[] = s.toCharArray();
        if(news.length % 2 != 0){
            return  false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < news.length; i++){
            if(news[i] == '('){
                stack.push(')');
            }else if (news[i] == '{'){
                stack.push('}');
            }else if(news[i] == '['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.peek() != news[i]){
                return false;
            }else{
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
