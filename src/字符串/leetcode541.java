package 字符串;

/**
 * @auther XMZ
 * @create 2023--31-下午2:03
 */
public class leetcode541 {
    public static void reversechar(char[] a, int left, int right){
        while (left < right){
            char temp;
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
    public String reverseStr(String s, int k) {
        char[] news = s.toCharArray();
        for(int i = 0; i < news.length; i += 2*k){
            reversechar(news,i,Math.min(i + k , news.length )- 1);
        }
        return new String(news);
    }
}
