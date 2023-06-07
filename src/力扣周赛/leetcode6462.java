package 力扣周赛;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @auther XMZ
 * @create 2023--04-下午2:33
 */
public class leetcode6462 {
    public int minimizedStringLength(String s) {
        Set<Character>  sites= new HashSet<Character>();
        for(char a : s.toCharArray()){
            sites.add(a);
        }
        return sites.size();
    }
}
