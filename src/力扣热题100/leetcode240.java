package 力扣热题100;

import java.util.regex.MatchResult;

/**
 * @auther XMZ
 * @create 2023--23-11:53
 */
public class leetcode240 {
    // 第一次想到的是最简便的方法，即找到矩阵的中心元素，分割成四个区域，进行取舍一定是最简便的方法，但是在实现过程种要使用递归，对递归的掌握并不收悉
    //故我们
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        return searchMatrixDigui(matrix, 0, 0,matrix[0].length - 1, matrix.length - 1, matrix[0].length -1 , matrix.length-1,target);
    }
    public boolean searchMatrixDigui(int[][] matrix,  int x1, int y1 , int x2,int y2, int xlength, int ylength,int target) {
        if(x1 > xlength || y1 > ylength){
            return false;
        }
        //x 是列， y是行，与坐标系一致
        if(x1 == x2 && y1 == y2){
            return matrix[x1][y1] == target;
        }
        int m1 = (x1 + x2) /2 ;
        int m2 = (y1 + y2) /2 ;
        if(matrix[m2][m1] == target){
            return true;
        }
        if(matrix[m2][m1] < target){
            // 右上
            return searchMatrixDigui(matrix, m1 + 1, y1, x2, m2, x2, y2, target) ||
                    //左下
                    searchMatrixDigui(matrix, x1 , m2+1,m1, y2,x2, y2,target)||
                    //左上
                    searchMatrixDigui(matrix, m1+ 1, m2+1,x2,y2,x2,y2,target);

        } else {
            // 右上矩阵
            return searchMatrixDigui(matrix, m1 + 1, y1, x2, m2, x2, y2, target) ||
                    // 左下矩阵
                    searchMatrixDigui(matrix, x1, m2 + 1, m1, y2, x2, y2, target) ||
                    // 左上矩阵
                    searchMatrixDigui(matrix, x1, y1, m1, m2, x2, y2, target);
        }


    }
}
