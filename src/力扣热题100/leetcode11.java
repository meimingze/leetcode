package 力扣热题100;

/**
 * @auther XMZ
 * @create 2023--15-上午11:37
 */
public class leetcode11 {
    public int maxArea(int[] height) {
        int left = 0;
        int square = 0;
        int right = height.length - 1;
        while (left < right && left < height.length -1){
            int length = Math.min(height[left],height[right]);
            int wide = right - left;
            square = Math.max(square,length*wide);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }

        }
        return square;
    }
}
