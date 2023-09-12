package 每日一题;

/**
 * @auther XMZ
 * @create 2023--11-上午8:34
 */
public class leetcode11 {
    public int maxArea(int[] height) {
        int  left = 0,right = height.length -1,res =  0;
        while (left < right){
            res = height[left] < height[right] ? Math.max((right-left)*height[left++],res):Math.max((right-left)*height[right--],res);
        }
        return res;
    }
}
