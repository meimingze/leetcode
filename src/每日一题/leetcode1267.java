package 每日一题;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther XMZ
 * @create 2023--24-上午9:15
 */
public class leetcode1267 {
    public int countServers(int[][] grid) {
        int res = 0;
        int m =grid.length;
        int n = grid[0].length;
        int row[] = new int[m];
        int col[] = new int[n];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    row[i]++;
                    col[j]++;
                }

            }
        }
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1 && (row[i] >1 || col[j] > 1) ){
                    res++;
                }

            }
        }
    return res;


    }
}
