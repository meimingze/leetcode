package 二分法;
//34. 在排序数组中查找元素的第一个和最后一个位置
//给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
//
//如果数组中不存在目标值 target，返回 [-1, -1]。
//
//你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。




/**
 * {*****}思路：这道题运用了二分查找的思想，但是由于target值是不只一个的，所以我们需要找到他的
 * 左边界和右边界，以左边界为例，我们在while循环中使用的是【left，right】闭区间，故在寻找的过程中最终return时一定为left=right，
 * 而此时我们为了保证此时一定为左边界，则要设定当”“nums[mid]>=target”“时，才能保证
 *
 * 注意：在最终结果时要分三种情况
 * 情况一：target 在数组范围的右边或者左边，例如数组{3, 4, 5}，target为2或者数组{3, 4, 5},target为6，此时应该返回{-1, -1}
 * 情况二：target 在数组范围中，且数组中不存在target，例如数组{3,6,7},target为5，此时应该返回{-1, -1}
 * 情况三：target 在数组范围中，且数组中存在target，例如数组{3,6,7},target为6，此时应该返回{1, 1}
 */
public class leetcode34_Medium_difficulty {
    public static void main(String[] args) {
        Solution sl  = new Solution();
        int[] nums = {5,7,7,8,10};
        int target = 7;
        int[] a = sl.searchRange(nums,target);
        for(int x:a){
            System.out.println(x);
        }
    }

}
class Solution {
    public int[] searchRange(int[] nums, int target) {
       int leftresult = Leftbinary(nums,target);
       int rightresult = Rightbinary(nums,target);
       if(leftresult == -1 || rightresult == -1){
           return new int[]{-1,-1};
       }
       if (rightresult - leftresult > 1){
           return new int[]{leftresult+1,rightresult-1};
       }
       return new int[]{-1,-1};
    }
    public int Leftbinary(int[] nums, int target){
        int left = 0;
        int right = nums.length -1 ;
        int newleft = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] >= target){
                right = mid - 1;
                newleft = right;
            }else{
                left = mid +1;
            }
        }
        System.out.println(newleft);
        return newleft;
    }
    public int Rightbinary(int[] nums, int target){
        int left = 0;
        int right = nums.length -1 ;
        int newright = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] <= target){
                left = mid + 1;
                newright = left;
            }
            if(nums[mid] > target){
                right = mid -1;
            }
        }
        System.out.println(newright);
        return newright;
    }
}