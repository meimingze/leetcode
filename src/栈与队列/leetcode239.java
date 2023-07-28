package 栈与队列;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @auther XMZ
 * @create 2023--10-下午7:12
 */
class MyQuene{
    Deque<Integer> deque = new LinkedList<>();
    void poll(int val){
        if(!deque.isEmpty() && val == deque.peek()){
            deque.poll();
        }
    }
    void add(int val) {
        while (!deque.isEmpty() && val > deque.getLast()) {
            deque.removeLast();
        }
        deque.add(val);
    }
    int peek() {
        return deque.peek();
    }
}
public class leetcode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 1){
            return nums;
        }
        int len = nums.length - k + 1;
        int res[] = new int[len];
        int num = 0;
        MyQuene myQueue = new MyQuene();
        //先将前k的元素放入队列
        for (int i = 0; i < k; i++) {
            myQueue.add(nums[i]);
        }
        res[num++] = myQueue.peek();
        for (int i = k; i < nums.length; i++) {
            //滑动窗口移除最前面的元素，移除是判断该元素是否放入队列
            myQueue.poll(nums[i - k]);
            //滑动窗口加入最后面的元素
            myQueue.add(nums[i]);
            //记录对应的最大值
            res[num++] = myQueue.peek();
        }
        return res;
    }
}
