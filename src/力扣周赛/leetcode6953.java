package 力扣周赛;

import java.util.List;

/**
 * @auther XMZ
 * @create 2023--06-上午11:05
 */
public class leetcode6953 {
    public boolean canSplitArray(List<Integer> nums, int m) {

        for(int i = 0; i < nums.size() -1 ; i++){
            if(nums.get(i) + nums.get(i+1) >= m){
                return true;
            }
        }
        return false;
    }
}
