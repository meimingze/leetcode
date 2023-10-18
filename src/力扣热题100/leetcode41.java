package 力扣热题100;

/**
 * @auther XMZ
 * @create 2023--18-上午9:43
 */
public class leetcode41 {
    // 缺失的第一个整数： 很难理解，对哈希表的理解不够透彻
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i ++){
            if(nums[i] <= 0){
                nums[i] = n + 1;
            }
        }
        for(int i = 0; i < n; i++){
            int temp = Math.abs(nums[i]);
            if(temp <= n){
                nums[temp - 1] = -Math.abs(nums[temp - 1]);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                return i+1;
            }
        }
        return n + 1;

    }
}
