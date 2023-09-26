package 力扣热题100;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @auther XMZ
 * @create 2023--18-下午3:24
 */
public class leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> news = new HashSet<>();
        int right = -1;
        int lenghtres = 0;
        for(int i = 0; i < s.length(); i++ ){
            while(right + 1 > s.length() && !news.contains(s.charAt(i))){
                news.add(s.charAt(i));
                right++;
            }
            if(i != 0){
                news.remove(s.charAt(i-1));
            }
            lenghtres = Math.max(lenghtres, right - i + 1);
        }
        return lenghtres;
    }
}
