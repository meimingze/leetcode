package 每日一题;

/**
 * @auther XMZ
 * @create 2023--16-上午10:12
 * 入门dp问题，找到子问题和递推关系即可
 */
public class leetcode198 {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        //dp
        //子问题： 偷k间房子的最大金额
        //dp(0) = 0
        //dp(1) = nums[0];
        //dp[k] = max(dp[k-1],dp[k-2]+nums[k-1])
        int dp[] = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 2; i <nums.length+1; i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }
        return dp[nums.length];
    }
}
