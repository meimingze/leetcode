package 每日一题;

import javax.security.sasl.SaslException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @auther XMZ
 * @create 2023--22-上午9:08
 */
public class leetcode849 {
    public int maxDistToClosest(int[] seats) {
        //第一种情况，在左侧边界
        int res = 0;
        int left = 0;
        while (seats[left] != 1 && left < seats.length){
            left++;
        }
        res  = Math.max(res,left);
        // 第二种情况，在中间
        while(left < seats.length){
            int right = left + 1;
            while(right < seats.length && seats[right] != 1){
                right ++;
            }
            //在右侧
            if(right == seats.length){
                res = Math.max(res,right - left);
            }else{//在中间
                res = Math.max(res,(right-left)/2);
            }
            left = right;
        }
        return res;
    }
}
