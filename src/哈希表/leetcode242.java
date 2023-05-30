package 哈希表;

/**
 * @auther XMZ
 * @create 2023--28-下午4:55
 */
public class leetcode242 {
    public boolean isAnagram(String s, String t) {
        int[] transform_asc = new int[26];
        for(int i = 0; i< s.length(); i++){
            transform_asc[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i  < t.length(); i++){
            transform_asc[t.charAt(i)-'a']--;
        }
        for(int i = 0; i < transform_asc.length; i++){
            if(transform_asc[i] != 0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

    }
}
