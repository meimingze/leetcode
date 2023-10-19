package 力扣热题100;

import java.util.ArrayList;
import java.util.List;

/**
@auther XMZ
@create 2023--19-下午3:17
*/public class leetcode73 {
    public void setZeroes(int[][] matrix) {
        //使用set的话会删除重复的行或列，减少循环次数
        List<Integer> zero_row = new ArrayList<>();
        List<Integer> zero_col = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    zero_row.add(j);
                    zero_col.add(i);
                }
            }
        }
        for(int i = 0; i < zero_row.size(); i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[zero_row.get(i)][j] = 0;
            }
        }
        for(int i = 0; i < zero_col.size(); i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[j][zero_col.get(i)] = 0;
            }
        }
    }
}
