package 力扣周赛;

import com.sun.org.apache.bcel.internal.generic.IUSHR;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther XMZ
 * @create 2023--11-上午10:37
 */
public class leetcode6465 {
    public String smallestString(String s) {
        int l = 0;
        int n = s.length();

        while (l < n && s.charAt(l) == 'a')
            l++;

        if (l == n) {
            // Exactly once
            char[] charArray = s.toCharArray();
            charArray[n - 1] = 'z';
            return new String(charArray);
        }

        int r = l;
        while (r < n && s.charAt(r) != 'a')
            r++;

        char[] charArray = s.toCharArray();
        for (int i = l; i < r; i++)
            charArray[i]--;

        return new String(charArray);
    }

    public static void main(String[] args) {
        leetcode6465 ll = new leetcode6465();
        String s = "cbabc";
        System.out.println(ll.smallestString(s));
    }
}
