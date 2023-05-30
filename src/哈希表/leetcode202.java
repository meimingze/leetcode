package 哈希表;

import java.util.HashSet;
import java.util.Set;

/**
 * @auther XMZ
 * @create 2023--28-下午7:25
 */
public class leetcode202 {
    public int gethappy(int n){
        int happy = 0;
        while (n >=1){
            int gewei = n % 10;
            n = n / 10;
            happy += gewei*gewei;
        }
        return happy;
    }
    // 我们要确定它是否会重复，即将其存入哈希set，若重复，则返回
    public boolean isHappy(int n) {
        Set<Integer> ishappyset = new HashSet<Integer>();
        while (n != 1 && !ishappyset.contains(n)){
            ishappyset.add(n);
            gethappy(n);
        }
        return n == 1;
    }
}
