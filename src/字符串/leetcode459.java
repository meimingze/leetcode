package 字符串;

/**
 * @auther XMZ
 * @create 2023--04-上午11:41
 */
public class leetcode459 {
    public boolean repeatedSubstringPattern(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            String news = s.substring(left,right);
            while(news.length() <= s.length()){
                if(s == news ){
                    return true;
                }else{
                    news += news;
                }
            }
            left++;
            right--;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
