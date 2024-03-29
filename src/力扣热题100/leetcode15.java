package 力扣热题100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther XMZ
 * @create 2023--16-上午9:07
 */
public class leetcode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] > 0){
                return res;
            }
            if(i != 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int target = nums[left] + nums[right] + nums[i];
                if(target > 0){
                    right--;
                }
                if(target < 0){
                    left++;
                }else if(target == 01``){
                    res.add(Arrays.asList(nums[i],nums[right],nums[left]));
                    while(left < right && nums[left] == nums[left +1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right - 1]){
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }
        return  res;
    }
}
