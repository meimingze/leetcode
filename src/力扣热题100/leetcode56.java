package 力扣热题100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther XMZ
 * @create 2023--28-上午10:18
 */
public class leetcode56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(v1,v2) -> v1[0] - v2[0]);
        int[][] res = new int[intervals.length][2];
        int index = -1;
        for(int[] a : intervals){
            if(index == -1 || a[0] > res[index][1]) {
                res[index++] = a;
            }else{
                res[index][1] = Math.max(res[index][1] , a[1]);
            }
        }
        return Arrays.copyOf(res,index+1);

    }
}
