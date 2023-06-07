package 双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther XMZ
 * @create 2023--05-下午4:54
 * 环形链表看似简单，实际上仍然有一些小思考
 */
public class leetcode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                return res;
            }
            if(i> 0&& nums[i] == nums[i -1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int sum = (nums[i] + nums[left] + nums[right]) ;
                if(sum > 0){
                    right--;
                }
                if(sum < 0){
                    left++;
                }
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[right],nums[left]));


                    while (left < right &&nums[left] == nums[left +1]){
                    left++;
                    }
                    while (left < right &&nums[right] == nums[right - 1]){
                    right--;
                    }
                    left++;
                    right--;
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        leetcode15 l1 = new leetcode15();
        List<List<Integer>> res = new ArrayList<>();
        int nums[] = {-1,0,1,2,-1,-4};
        res = l1.threeSum(nums);
        for(Object i : res){
            System.out.println(i);
        }
    }
}
