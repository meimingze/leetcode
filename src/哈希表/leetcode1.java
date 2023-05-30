package 哈希表;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther XMZ
 * @create 2023--29-上午10:21
 */
public class leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> checknum = new HashMap<>();
        if(nums.length <= 0 ){
            return null;
        }
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(checknum.containsKey(temp)){
                res[1] = i;
                res[0] = checknum.get(temp);
            }
            checknum.put(nums[i],i );
        }
        return res;
    }

}
