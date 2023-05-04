package 数组.算法.作业;

import java.util.Scanner;

/**
 * @auther XMZ
 * @create 2023--20-下午4:25
 */
class New_Array{
    int traffic_brand = 0;
    int traffic_sum = 0;
}
public class Timus_1604 {
    public static int get_max(int a , int b){
        if(a < b){
            return b;
        }else{
            return a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        New_Array newArray[] = new New_Array[num];
        int arraysum = 0;
        for(int i = 0; i < num; i ++){
            int a = sc.nextInt();
            newArray[i] = new New_Array();
            newArray[i].traffic_sum = a;
            newArray[i].traffic_brand = i + 1;
            arraysum = arraysum + newArray[i].traffic_sum;
        }
        //将数组sum从大到小排序
        New_Array arraytemp;
        for(int i = 0; i < num;i ++){
            int max_sum = 0;
            int temp = 0;
            for(int j = i; j < num; j++){
                if(newArray[j].traffic_sum > max_sum){
                    max_sum = newArray[j].traffic_sum;
                    temp = j;
                }
            }
            arraytemp = newArray[i];
            newArray[i] = newArray[temp];
            newArray[temp] = arraytemp;
        }
        // 先将以上信息存放到一个一维数组中
        int yiweiarray[] = new int[arraysum];
        int sum = 0;
        int brand = 0;
        int point = 0;
        for(int i = 0; i < num; i ++){
            sum = newArray[i].traffic_sum;
            brand = newArray[i].traffic_brand;
            while(sum > 0){
                yiweiarray[point] = brand;
                point++;
                sum--;
            }
        }
        // 新建一个二维矩阵，并将数据存放进去
        int col = newArray[0].traffic_sum;
        int row = arraysum/col + 1;
        int matrix[][] = new int[row][col];
        int newpoint = 0;
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                if(newpoint > arraysum - 1){
                    break;
                }
                matrix[i][j] = yiweiarray[newpoint];
                newpoint++;

            }
        }
        for(int i = 0; i < col; i ++){
            for(int j = 0; j < row ; j++){
                if(matrix [j][i] == 0){
                    continue;
                }else {
                System.out.print(matrix[j][i]+ " ");
                }
        }
        }
    }
}
