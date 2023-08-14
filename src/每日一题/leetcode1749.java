package 每日一题;

public class leetcode1749 {
    public int maxSubArray(int nums[])
    {
        int length = nums.length;
        int dp[] = new int[length];
        dp[0] = nums[0];
        int result = Integer.MIN_VALUE;
        for(int i =1 ; i< nums.length; i++)
        {
            if(dp[i -1] >0)
            {
                dp[i] += dp[i-1] + nums[i];
            }else{
                dp[i] = nums[i];
            }
            result = Math.max(result,dp[i]);
        }
        return result;
     }
}
