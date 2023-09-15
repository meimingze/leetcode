package 力扣热题100;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther XMZ
 * @create 2023--14-下午7:25
 */
public class leetcode293 {
    public void moveZeroes(int[] nums) {
        int fast = 0;
        int slow = 0 ;
        for(;fast < nums.length; fast++ ){
            if(nums[fast] != 0){
                int temp = nums[fast];
                nums[slow] = nums[fast];
                nums[fast] = nums[slow];
                slow++;
            }
        }

    }
}
