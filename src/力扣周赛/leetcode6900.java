package 力扣周赛;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @auther XMZ
 * @create 2023--30-下午12:04
 */
public class leetcode6900 {
}
class Solution6900 {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> newnums = new HashSet<>();
        for(int i = 0;i < nums.length; i++){
            newnums.add(nums[i]);
        }
        int res = 0;
        int m = newnums.size();
        for(int i = 0; i < nums.length; i++){
            int n = nums.length;
            for(int j = 0; j < m; i++){
                if(newnums.contains(nums[i])){
                    res++;
                }
            }
        }
        return res;
    }
}
