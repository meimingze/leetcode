package 数组.算法.滑动窗口;
//209. 长度最小的子数组
//给定一个含有 n 个正整数的数组和一个正整数 target 。
//
//找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。

//输入：target = 7, nums = [2,3,1,2,4,3]
//输出：2
//解释：子数组 [4,3] 是该条件下的长度最小的子数组。

/**
 *
 */
public class leetcode209_长度最小的子数组 {
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int beginindex = 0;
        int endindex = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        while(endindex < nums.length){
            sum = sum + nums[endindex];
            while(sum >= target){
                result = Math.min(result, endindex - beginindex + 1);
                sum = sum - nums[beginindex];
                beginindex++;
            }
            endindex++;
        }
        return result == Integer.MAX_VALUE ? result : 0;

    }
}
