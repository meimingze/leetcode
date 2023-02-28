/*
3. 无重复字符的最长子串
给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class leetcode3 {
}
class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 1){
            return 0;
        }
        char news[] = s.toCharArray();
        int left = 0;
        int right = 0;
        int max = 0;

        while(left <= right && right < s.length()) {
            boolean flag = false;
            for(int i = left; i < right; i++){
                if (news[i] == news[right]){
                    flag = true;
                    max = Math.max(max,right - i);
                    left = i + 1;
                }

            }
            if(!flag){
                max = Math.max(max,right-left+1);
                right++;
            }

        }
        return max ;
    }
}
