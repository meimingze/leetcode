package 字符串;

import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;

/**
 * @auther XMZ
 * @create 2023--31-下午5:14
 */
public class leetcode28 {
    public static int strStr(String haystack, String needle) {
        int needle_num = needle.length();
        int res = -1;

        boolean flag = true;
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int save = 0;
                if (i + needle_num > haystack.length()){
                    return res;
                }
                for(int j = i; j < i+needle_num;j++){
                    if(haystack.charAt(j) != needle.charAt(save)){
                        flag = false;
                    }
                    save++;
                }
                if(flag){
                    res = i;
                    return res;
                }
            }
            flag = true;

        }
        return -1;
    }

    public static void main(String[] args) {
        String a = "hello";
        String b = "ll";
        System.out.println(strStr(a,b));
    }
}
