package 力扣热题100;

import java.util.*;

/**
 * @auther XMZ
 * @create 2023--12-上午8:45
 * 本道题目主要考察hashmap的使用，排序后我觉得使用Stringbuffer判断是否相同，再返回下标也是可以的
 */
public class leetcode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> chargestrs = new HashMap<>();
        for(String str : strs){
            char strarray[] = str.toCharArray();
            Arrays.sort(strarray);
            String key = new String(strarray);
            List<String> list = chargestrs.getOrDefault(key,new ArrayList<>());
            list.add(str);
            chargestrs.put(key,list);
        }
        return new ArrayList<List<String>>(chargestrs.values());
    }
}
