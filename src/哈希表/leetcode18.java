package 哈希表;

import com.sun.org.apache.bcel.internal.generic.IUSHR;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther XMZ
 * @create 2023--31-上午10:47
 */
public class leetcode18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] > 0 && nums[i] > target){
                return res;
            }
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            for(int j = i + 1;j < nums.length ; j ++){
                if(j > i+ 1 && nums[j] == nums[j -1 ]){
                    continue;
                }
                int left = j + 1;
                int right = nums.length - 1;
                while(left < right){
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum > target){
                        right--;
                    }
                    if(sum < target){
                        left++;
                    }
                    if(sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (right > left && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        while (right > left && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
