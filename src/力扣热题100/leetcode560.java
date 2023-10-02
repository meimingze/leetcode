package 力扣热题100;

/**
 * @auther XMZ
 * @create 2023--26-上午10:02
 */
public class leetcode560 {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    res++;
                }
                if(sum > k){
                    break;
                }
            }
        }
        return res;
    }
}
