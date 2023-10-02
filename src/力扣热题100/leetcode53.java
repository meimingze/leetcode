package 力扣热题100;

/**
 * @auther XMZ
 * @create 2023--30-上午10:41
 */
public class leetcode53 {
    public int maxSubArray(int[] nums) {
        // 转换为dp问题，首先我们知道若两个元素的话，dp[i] = max(dp[i -1],dp[i-1]+nums[i])
        int n = nums.length;
        int dp[] = new int[n];
        dp[0] = nums[0];
        for(int i = 1; i < n; i++){
            if(dp[i-1]>0){
                dp[i] = dp[i-1]+nums[i];
            }else{
                dp[i] = nums[i];
            }
        }
        int res= -1000000000;
        for(int i = 0; i< nums.length;i++){
            res = Math.max(res,dp[i]);
        }
        return res;
    }

}
