package 力扣热题100;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @auther XMZ
 * @create 2023--14-上午8:34
 */
public class leetcode128 {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> hashnums = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hashnums.add(nums[i]);
        }
        int res = 0;
        for(int num: hashnums){
            if(!hashnums.contains(num - 1)){
                int currentNum = num;
                int currentRes = 1;
                while(hashnums.contains(currentNum+1)){
                    currentRes++;
                    currentNum++;
                }
                res = Math.max(res,currentRes);
            }

        }
        return res;
    }
}
