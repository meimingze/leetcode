package 力扣热题100;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther XMZ
 * @create 2023--20-上午10:09
 */
public class leetcode54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        //按层循环,边界问题需要考虑清楚
        int up = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (left <= right && up <= down){
            for(int i = left; i < right; i++){
                res.add(matrix[up][i]);
            }
            for(int i = up+1; i < down; i++){
                res.add(matrix[i][right]);
            }
            for(int i = right - 1; i > left; i--){
                res.add(matrix[down][i]);
            }
            for(int i = down - 1; i > up+1; i--){
                res.add(matrix[i][left]);
            }
            left++;
            down--;
            right--;
            up++;
        }
        return res;
    }
}
