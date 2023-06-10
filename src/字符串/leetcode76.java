package 字符串;

import com.sun.java.swing.plaf.windows.resources.windows;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @auther XMZ
 * @create 2023--07-下午3:51
 */
public class leetcode76 {
    public String minWindow(String s, String t) {
        Map<Character,Integer> windows = new HashMap<>();
        Map<Character,Integer> need = new HashMap<>();
        int len = Integer.MAX_VALUE;
        char news[] = s.toCharArray();
        int left = 0;
        int right = 0;
        int start = 0;
        int valid = 0;// 用于记录是否达到包含所需字符串的长度
        for(int i = 0; i < t.length(); i++){
            need.put(s.charAt(i),need.getOrDefault(s.charAt(i),0)+1);
        }
        while(right < s.length()){
            char c = news[right];
            right++;
            if(need.containsKey(c))
            {
                windows.put(c,windows.getOrDefault(c,0)+ 1);
                if(windows.get(c).equals(need.get(c))){
                    valid++;
                }
            }
            while (valid == need.size()){
                char d = news[left];
                if(right - left < len){
                    start = left;
                    len = right - left;
                }
                left++;
                if(need.containsKey(d)){
                    if(windows.get(d).equals(need.equals(d))){
                        valid--;
                    }
                    windows.put(d, windows.getOrDefault(d,0)+1);
                }

            }
        }
    return s.substring(start,start+len);
    }
}
