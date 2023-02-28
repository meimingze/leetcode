/**
 * 75. 颜色分类
 * 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 * 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *
 * 必须在不使用库内置的 sort 函数的情况下解决这个问题。
 */
public class leetcode75 {
}
class Solution75 {
    public void sortColors(int[] nums) {
        int numslength = nums.length;
        int pointer0 = 0;
        int pointer1 = 0;
        int pointer2 = 0;
        for(int i = 0; i < numslength; i++){
            if(nums[i] == 0){
                pointer0++;
            }else if(nums[i] == 1){
                pointer1++;
            }else if(nums[i] == 2){
                pointer2++;
            }
        }
        for(int i = 0;i < pointer0;i++){
            nums[i] = 0;
        }
        for(int i = pointer0; i < pointer1+pointer0; i++){
            nums[i] = 1;
        }
        for(int i = pointer1+pointer0; i < numslength; i++){
            nums[i] = 2;
        }
    }
}