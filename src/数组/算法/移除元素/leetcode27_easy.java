package 数组.算法.移除元素;
//27.移除元素
//给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
//
//不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
//
//元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
//
//

/**
 * 使用双指针法：
 *快慢指针，只需要遍历一次，而暴力求解则需要遍历两次，复杂度为o（n*2）
 */
public class leetcode27_easy {
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int low = 0;
        for(int fast = 0; fast < nums.length; fast++){
            if(nums[fast]!= val){
                nums[low] = nums[fast];
                low++;
            }
        }
        return low;
    }

}
