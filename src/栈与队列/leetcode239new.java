package 栈与队列;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @auther XMZ
 * @create 2023--28-上午10:25
 */
public class leetcode239new {
    class MyQuene{
        Deque<Integer> deque = new LinkedList<>();
        void poll(int val){
            if(!deque.isEmpty() && val == deque.peek()){
                deque.poll();
            }
        }
        void add(int val){
            while(!deque.isEmpty() && val > deque.getLast()){
                deque.removeLast();
            }
            deque.add(val);
        }
        int peek(){
            return deque.peek();
        }
    }
    class Solution{
        public int[] maxSlidingWindow(int[] nums, int k) {
            if(nums.length == 1){
                return nums;
            }
            int len = nums.length - k + 1;
            int[] res = new int[len];
            int num = 0;
            MyQuene myQuene = new MyQuene();
            for(int i = 0; i < k; i++){
                myQuene.add(nums[i]);
            }
            res[num++] = myQuene.peek();
            for(int i= 0; i < nums.length; i++){
                myQuene.poll(nums[i - k]);
                myQuene.add(nums[i]);
                res[num++] = myQuene.peek();
            }
            return res;
        }
    }
}
