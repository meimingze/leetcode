package 每日一题;

import com.sun.org.apache.regexp.internal.RE;

import java.util.*;

/**
 * @auther XMZ
 * @create 2023--02-上午8:57
 */
public class leetcode862 {
    public int flipgame(int[] fronts, int[] backs) {
        HashSet<Integer> newfronts = new HashSet<>();
        for(int i = 0; i < fronts.length; i++){
            if(fronts[i] == backs[i]){
                newfronts.add(backs[i]);
            }
        }
        int res = 3000;
        for(int x : fronts){
            if(!newfronts.contains(x) && x < res){
                res = x;
            }
        }
        for(int x : backs) {
            if (!newfronts.contains(x) && x < res) {
                res = x;
            }
        }
        return res % 3000; // 如果没有的话，我们要返回0

    }
}
