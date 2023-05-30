package leetcode;

/**
 * /1605. 给定行和列的和求可行矩阵
 * 给你两个非负整数数组 rowSum 和 colSum ，其中 rowSum[i] 是二维矩阵中第 i 行元素的和， colSum[j] 是第 j 列元素的和。换言之你不知道矩阵里的每个元素，但是你知道每一行和每一列的和。
 * 请找到大小为 rowSum.length x colSum.length 的任意 非负整数 矩阵，且该矩阵满足 rowSum 和 colSum 的要求。
 * 请你返回任意一个满足题目要求的二维矩阵，题目保证存在 至少一个 可行矩阵。
 *
 *
 * @auther XMZ
 * @create 2023--14-22:19
 */
//思路：
    //简单的贪心算法
public class leetcode1605_mid {
    public static void main(String[] args) {
        Solution1605 sl = new Solution1605();
        int row[]  = {5,8,3};
        int col[] = {4,7,2};
        int aa[][] = sl.restoreMatrix(row,col);
        for(int i = 0; i < aa.length; i++){
            for (int j = 0; j < aa.length; j++){
                System.out.println(aa[i][j]);
            }
        }
    }
}
class Solution1605 {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length;
        int m = colSum.length;
        int[][] res = new int[n][m];
        int i = 0;
        int j = 0;
        while(i < n && j < m){
            int v = Math.min(rowSum[i] , colSum[j]);
            res[i][j] = v;
            rowSum[i] = rowSum[i] - v;
            colSum[j] = colSum[j] - v;
            if(rowSum[i] == 0){
                i++;
            }
            if(colSum[j] == 0){
                j++;
            }

        }
        return res;

    }
}
