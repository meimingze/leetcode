package 移除元素;
//283.移动零
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//输入: nums = [0,1,0,3,12]
//输出: [1,3,12,0,0]

/**
 * 两种解法：解法一：两次遍历，即在删除数组（将数组中非零元素左移）的基础上，再将最后的几个遍历并赋值为0
 * 解法二：一次遍历，两个指针快慢，快指针先找到非零元素，将其与慢指针交换，则得到了新的数组
 */
public class leetcode283_easy {

}
class Solution283 {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        for(int fast = 0; fast < nums.length; fast++){
            if(nums[fast] != 0){
                int temp  = 0;
                temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }
    }
}
