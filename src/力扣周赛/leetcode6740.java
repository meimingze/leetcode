package 力扣周赛;

/**
 * @auther XMZ
 * @create 2023--11-上午10:30
 */
public class leetcode6740 {
    public int findNonMinOrMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0 ; i< nums.length; i++){
            max = Math.max(nums[i],max );
            min = Math.min(nums[i],min);
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!= max && nums[i] != min ){
                return nums[i];
            }
        }
        return -1;
    }
}
