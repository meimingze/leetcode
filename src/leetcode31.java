/**
 * 31. 下一个排列
 * 整数数组的一个 排列  就是将其所有成员以序列或线性顺序排列。
 * 例如，arr = [1,2,3] ，以下这些都可以视作 arr 的排列：[1,2,3]、[1,3,2]、[3,1,2]、[2,3,1] 。
 * 整数数组的 下一个排列 是指其整数的下一个字典序更大的排列。更正式地，如果数组的所有排列根据其字典顺序从小到大排列在一个容器中，那么数组的 下一个排列 就是在这个有序容器中排在它后面的那个排列。如果不存在下一个更大的排列，那么这个数组必须重排为字典序最小的排列（即，其元素按升序排列）。
 * 例如，arr = [1,2,3] 的下一个排列是 [1,3,2] 。
 * 类似地，arr = [2,3,1] 的下一个排列是 [3,1,2] 。
 * 而 arr = [3,2,1] 的下一个排列是 [1,2,3] ，因为 [3,2,1] 不存在一个字典序更大的排列。
 * 给你一个整数数组 nums ，找出 nums 的下一个排列。
 * 必须 原地 修改，只允许使用额外常数空间。
 */


import java.util.Scanner;

public class leetcode31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[]{sc.nextInt()};
        Solution31 sl31 = new Solution31();
        sl31.nextPermutation(num);

    }
}
class Solution31 {
    public void nextPermutation(int[] nums) {
        int secondend = nums.length - 2;
        //secondend找到首个非降序的位置
        //firstend找到首个比nums[firstend]大的数

        while(secondend >= 0 && nums[secondend] >= nums[secondend+1]){
            secondend--;
        }
        if(secondend >= 0){
            int firstend = nums.length - 1;
            while(firstend >= 0 && nums[secondend] >= nums[firstend]){
                firstend--;
            }
            swap(nums , firstend, secondend);
        }
        reverse(nums, secondend+1);


    }
    //将比firstend大的最小的数与其换位
    public void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    //将换位后的数进行升序排序
    public void reverse(int[] nums, int start){
        int left = start;
        int right = nums.length -1;
        while(left < right){
            swap(nums,left,right);
            left ++;
            right --;
        }
    }
}