package 每日一题;

/**
 * @auther XMZ
 * @create 2023--11-上午9:25
 */
public class leetcode1572 {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum1 = 0;
        int sum2 = 0;
        if(n % 2 == 0) {
            int index = 0;
            for (int i = 0; i < n; i++) {
                sum1 += mat[i][i];
            }
            for(int i = n -1 ; i >0; i--){

                sum2 += mat[index][i];
                index++;
            }
        }else{
            int index = 0;
            for (int i = 0; i < n; i++) {
                sum1 += mat[i][i];
            }
            for(int i = n -1 ; i >=0; i--){

                sum2 += mat[index][i];
                index++;
            }
            sum1 = sum1 - mat[n/2-1][n/2-1];
        }

        return sum1+sum2;
    }

    public static void main(String[] args) {
        int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
        leetcode1572 l1 = new leetcode1572();
        System.out.println(l1.diagonalSum(mat));
    }
}
