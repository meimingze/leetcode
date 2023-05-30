package 哈希表;

import java.util.HashSet;
import java.util.Set;

/**
 * @auther XMZ
 * @create 2023--28-下午5:14
 */
public class leetcode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num1 = new HashSet<Integer>();
        Set<Integer> num2 = new HashSet<Integer>();
        int res[];
        for (int i = 0;i < nums1.length; i++){
            num1.add(nums1[i]);
        }
        for(int i = 0; i< nums2.length; i++){
            num2.add(nums2[i]);
        }
        return getres(num1,num2);

    }
    public int[] getres(Set<Integer> set1,Set<Integer> set2){
        if(set1.size()>set2.size()){
            return getres(set2,set1);
        }
        Set<Integer> res = new HashSet<Integer>();
        for(int num : set1){
            if(set2.contains(num)){
                res.add(num);
            }
        }
        int result[] = new int[res.size()];
        int index = 0;
        for(int num : res){
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
