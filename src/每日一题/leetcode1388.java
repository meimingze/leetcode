package 每日一题;

import java.util.Arrays;

/**
 * @auther XMZ
 * @create 2023--18-上午9:28
 */
public class leetcode1388 {
    private int n;
    public int maxSizeSlices(int[] slices) {
        n = slices.length/3;
        int[] nums = new int[slices.length - 1];
        System.arraycopy(slices, 1, nums, 0, nums.length);
        int a = danxiangdp(nums);
        System.arraycopy(slices, 0, nums, 0, nums.length);
        int b = danxiangdp(nums);
        return Math.max(a, b);
    }
    public int danxiangdp(int[] nums){
        int m = nums.length;
        int dp[][] = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                dp[i][j] = Math.max(dp[i-1][j],(i>=2 ? dp[i-2][j-1] : 0)+nums[i-1]);
            }
        }
        return  dp[m][n];
    }
}
