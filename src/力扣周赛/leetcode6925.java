package 力扣周赛;

/**
 * @auther XMZ
 * @create 2023--06-上午10:35
 */
public class leetcode6925 {
    public String finalString(String s) {
        char news[] = s.toCharArray();
        for(int i = 0; i < news.length; i ++){
            if(s.charAt(i) == 'i'){
                revrse(news,0,i-1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char a: news){
            if(a != 'i'){
                sb.append(a);
            }
        }

        return sb.toString();
    }
    public void revrse(char[] s,int start,int end){
        char news[]  = new char[s.length];
        char temp;
        while (start < end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
