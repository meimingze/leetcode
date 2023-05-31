package 字符串;

/**
 * @auther XMZ
 * @create 2023--31-下午1:54
 */
public class leetcode344 {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while(left < right && left < s.length / 2 ){
            char temp;
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        reverseString(s);
        for(char m : s){
            System.out.println(m);
        }
    }
}
