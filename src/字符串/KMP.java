package 字符串;

/**
 * @auther XMZ
 * @create 2023--01-下午3:08
 * KMP算法解决字符串匹配问题
 *
 * 前缀：不包含尾字母的所有子串   如：aabaaf  前缀为：不含f的所有子串
 * 后缀：不包含首字母的所有子串
 * 前缀表：最长相等前后缀
 * a : 0
 * aa : 1
 * aab : 0
 * aaba : 1
 * aabaa : 2
 * aabaaf : 0
 *
 */
public class KMP {
    private int  strStr(String haystack, String needle) {
        if(needle.length() == 0 ) return 0;
        int[] next = new int[needle.length()];
        getnext(next,needle);
        int j = 0;
        for(int i=  0; i< haystack.length();i++){

        }
        return 0;
    }
    private void getnext(int[] next , String s){
        int j = 0;
        next[0] = 0;
        for(int i = 1; i < next.length; i++){
            while (j > 0 && s.charAt(j) != s.charAt(i)){
               j = next[j - 1];
            }
            if(s.charAt(j) == s.charAt(i)){
                j++;
            }
            next[i] = j;
        }

    }

}
