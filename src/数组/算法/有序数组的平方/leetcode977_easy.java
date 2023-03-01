package 数组.算法.有序数组的平方;
//977. 有序数组的平方
//给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。

//示例 1：
//
//输入：nums = [-4,-1,0,3,10]
//输出：[0,1,9,16,100]
//解释：平方后，数组变为 [16,1,0,9,100]
//排序后，数组变为 [0,1,9,16,100]

/**
 * solution1:暴力求解，先遍历一遍数组，再使用sort升序排序 --复杂度（n+logn）
 * solution2：双指针：使用左右两个指针，分别比较两端的大小并进行排序
 */
public class leetcode977_easy {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] nums = {0,2};
        int[] res = sl.sortedSquares(nums);
        for(int n:res){
            System.out.printf("%d\n",n);
        }
    }
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0, j = nums.length - 1, pos = nums.length - 1; i <= j;) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                ans[pos] = nums[i] * nums[i];
                ++i;
            } else {
                ans[pos] = nums[j] * nums[j];
                --j;
            }
            --pos;
        }
        return ans;
    }
    }
