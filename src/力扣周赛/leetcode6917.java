package 力扣周赛;

import java.util.Arrays;

/**
 * @auther XMZ
 * @create 2023--30-下午12:01
 */
public class leetcode6917 {

}
class Solution6917 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res= 0;
        for(int i = 0; i < hours.length;i ++){
            if(hours[i] >= target){
                res++;
            }
        }
        return res;
    }
}
