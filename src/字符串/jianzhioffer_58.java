package 字符串;

/**
 * @auther XMZ
 * @create 2023--31-下午5:10
 */
public class jianzhioffer_58 {
    public String reverseLeftWords(String s, int n) {
        StringBuffer sb = new StringBuffer();
        for(int i = n ;i < s.length(); i ++){
            sb.append(s.charAt(i));
        }
        for(int i = 0;i < n ; i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
