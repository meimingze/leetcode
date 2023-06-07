package 双指针;

/**
 * @auther XMZ
 * @create 2023--05-下午3:44
 */
public class leetcode151 {
    public String reverseWords(String s) {
        int start,end;
        StringBuffer sb = new StringBuffer();
        for(int i = s.length() -1; i > 0; i--){
            if(s.charAt(i) == ' ') continue;
            end = i + 1;
            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            start = i + 1;
            for(int j = start; j < end; j++){
                sb.append(s.charAt(j));
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
