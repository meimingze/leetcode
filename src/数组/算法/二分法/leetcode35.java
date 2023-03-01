package 数组.算法.二分法;//35. 搜索插入位置
//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//请必须使用时间复杂度为 O(log n) 的算法。
//输入: nums = [1,3,5,6], target = 5
  //      输出: 2
/**
 *二分查找的一个小变化，没有难度
 */

public class leetcode35 {
}
class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1 ;
        while(left <= right){
            int mid = (right - left) / 2 + left;
            if(nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target){
                left = mid + 1;
            }
            if(nums[mid] > target){
                right = right -1;
            }
        }
        return left;
    }
}
