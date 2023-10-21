package 力扣热题100;

/**
 * @auther XMZ
 * @create 2023--21-9:37
 */
public class leetcode481 {
    // 其实最为直观的是使用矩阵的运算，先倒置，然后再对角倒置，就出现了目标函数

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n/2; i++){
            for(int j = 0; j < (n+1)/2; j++){
                int temp  = matrix[i][j];
                 matrix[i][j] = matrix[n - j - 1][i];
                 matrix[n- j - 1][i] = matrix[n- i - 1][n - j -1];
                 matrix[n - i - 1][n- j - 1] = matrix[j][n -i -1 ];
                 matrix[j][n- i- 1] = temp;
            }
        }
    }
}
