package 每日一题;

/**
 * @auther XMZ
 * @create 2023--04-上午9:33
 *
 * 回溯算法
 * 模拟机器人的上下左右操作，每走一步都要做一次判断，若
 */
public class leetcode908 {
    int count  =0 ;
    int m,n;
    public int uniquePathsIII(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        int emptySquares = 0;
        for(int i = 0;i < m;i ++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 0){
                    emptySquares++;
                }
            }
        }
        for(int i = 0;i < m;i ++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    dfs(grid, i , j,emptySquares);
                }//找到起点，开始出发
            }
        }
        return count;
    }
    public void dfs(int[][] grid, int i , int j ,int emptySquares){
        if( i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == -1 || grid[i][j] == -2){
            return;
        }//如果出街或者走到墙上或走原路，都要返回
        if(grid[i][j] == 2){
            if(emptySquares == -1){
                count++;
            }
            return;
        }
        grid[i][j] = -2;//走过的格子我们要对他进行一个赋值操作
        dfs(grid, i + 1, j , emptySquares-1);//一直往右走
        dfs(grid, i -1 , j , emptySquares-1);
        dfs(grid, i, j+1 , emptySquares-1);
        dfs(grid, i, j-1 , emptySquares-1);
        grid[i][j] = 0;
    }
}
