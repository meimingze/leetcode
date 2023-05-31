package 字符串;

/**
 * @auther XMZ
 * @create 2023--31-下午3:51
 */
public class leetcode151 {
    public String reverseWords(String s) {
        s = s + ' ';
        StringBuffer sb = new StringBuffer();
        int start = 0;
        int end = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                continue;
            }
            end = i + 1;
            while (i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            start = i + 1;
            for(int j = start; j < end; j++){
                sb.append(s.charAt(j));
            }
            sb.append(' ');
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public static void main(String[] args) {
        leetcode151 l = new leetcode151();
        String s = "  hello world  ";
        System.out.println(l.reverseWords(s));
    }
}
