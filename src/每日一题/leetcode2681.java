package 每日一题;

import java.util.Arrays;

/**
 * @auther XMZ
 * @create 2023--01-上午8:50
 */
public class leetcode2681 {
    public int sumOfPower(int[] nums) {
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        int[] preSum = new int[nums.length + 1];
        int res = 0, mod = 1000000007;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = (nums[i] + preSum[i]) % mod;
            preSum[i + 1] = (preSum[i] + dp[i]) % mod;
            res = (int) ((res + (long) nums[i] * nums[i] % mod * dp[i]) % mod);
            if (res < 0) {
                res += mod;
            }
        }
        return res;
    }

        public static void main (String[]args){
            int num[] = {2, 1, 4};


        }

    }