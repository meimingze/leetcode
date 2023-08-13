package 每日一题;

import java.util.Arrays;

/**
 * @auther XMZ
 * @create 2023--13-上午9:20
 */
public class leetcode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
