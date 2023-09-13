package 力扣热题100;

import java.util.HashMap;

/**
 * @auther XMZ
 * @create 2023--13-上午9:24
 */
public class leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(target - nums[i])){
                return new int[]{hash.get(target - nums[i]),i};
            }
            hash.put(nums[i],i);
        }
        return new int[0];
    }
}
