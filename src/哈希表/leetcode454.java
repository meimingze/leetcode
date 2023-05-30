package 哈希表;

import java.util.HashMap;

/**
 * @auther XMZ
 * @create 2023--29-上午10:40
 */
public class leetcode454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res = 0;
        HashMap<Integer,Integer> a_b = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                int sum = nums1[i] + nums2[j];
                a_b.put(sum,a_b.getOrDefault(sum,0)+1);
            }
        }
        for (int i = 0; i< nums3.length; i++){
            for(int j = 0; j <nums4.length;j ++){
                res += a_b.getOrDefault(0-nums3[i]-nums4[j],0);
            }
        }
        return res;
    }
}
