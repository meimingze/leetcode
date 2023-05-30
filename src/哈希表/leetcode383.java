package 哈希表;

/**
 * @auther XMZ
 * @create 2023--29-上午11:52
 */
public class leetcode383 {
    public boolean canConstruct(String ransomNote, String magazine){
        int count[] = new int[26];
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        for(char i : magazine.toCharArray()){
            count[i - 'a']++;
        }
        for(char i : ransomNote.toCharArray()){
            count[i - 'a']--;
            if(count[i - 'a']< 0){
                return false;
            }
        }
        return true;
    }
}
