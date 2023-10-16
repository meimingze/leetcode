package 力扣热题100;

import java.util.Arrays;

/**
 * @auther XMZ
 * @create 2023--12-下午2:37
 */
public class leetcode189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        replace(nums, 0, nums.length-1);
        replace(nums, 0,k-1);
        replace(nums,k,nums.length -1);

    }
    public void replace(int[] num, int start, int  end){
        while(start < end && end < num.length && start < num.length){
            int temp = 0;
            temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }
}
