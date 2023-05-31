package 哈希表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @auther XMZ
 * @create 2023--30-下午4:18
 */
public class leetcode15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0 ){
                return res;
            }
            if(i > 0 && nums[i] == nums[i -1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (right > left){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0){
                    right--;
                }
                if(sum < 0){
                    left++;
                }
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                }
                //去重应该在找到一个三元组之后
                while(right > left && nums[right] == nums[right - 1]){
                    right--;
                }
                while(right > left && nums[left] == nums[left + 1] ){
                    left++;
                }
                left ++;
                right --;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
