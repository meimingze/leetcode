package 力扣热题100;

import java.util.*;

/**
 * @auther XMZ
 * @create 2023--20-上午10:16
 */
public class leetcode438 {
    public List<Integer> findAnagrams(String s, String p) {
        int plength = p.length();
        List<Integer> res = new ArrayList<>();
        int sCount[] = new int[26];
        int pCount[] = new int[26];
        for(int i = 0; i < p.length(); i++){
            pCount[p.charAt(i - 'a')]++;
        }
        for(int l = 0,r = 0; r < s.length(); r++){
            sCount[s.charAt(r) - 'a']++;
            if(r - l + 1 < p.length()){
                r++;
            }
            while (r - l + 1 > p.length()){
                sCount[s.charAt(l) - 'a']--;
                l++;
            }
            if(Arrays.equals(sCount,pCount)){
                res.add(l);
            }
        }
        return res;
    }

}