//二分查找（简单）
//给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。

/**
 * 可以暴力求解，但是二分查找的复杂度更底一些
 * 二分查找方法：首先定义left和right边界，
 */
public class leetcode704 {
}
class Solution704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (right - left) / 2 + left;
            if(nums[mid] < target){
                left = mid + 1;
            }
            if(nums[mid] > target){
                right = mid -1;
            }else {
                return mid;
            }

        }
        return -1;
    }
}