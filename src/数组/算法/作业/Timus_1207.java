package 数组.算法.作业;

import java.util.Scanner;

/**
 * @auther XMZ
 * @create 2023--17-下午4:23
 *
 *
 * --------------------1207. Median on the Plane----------------------------
 * The are N points on the plane (N is even).No three points lie on the same straight line.
 * Your task is to select two points in such a way,
 * that straight line they belong to divides the set of points into two equal-sized parts.
 *  Input
 *  First line contains one integer N (4 ≤ N ≤ 10000). Each of next N lines contains pair of integers xi, yi (−106 ≤ xi, yi ≤ 106), the coordinates of i-th point.
 *  Output
 *  Print the numbers of selected points.
 */
public class Timus_1207 {
    public static int getmin(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    public static double calculate_tan(int b_y, int a_y, int b_x, int a_x) {
        double res = (b_y - a_y) / (b_x - a_x);
        return res;
    }

    public static double[] quick_sort(double arr[],int start,int end) {
        double pivot = arr[start];
        int i = start;
        int j = end;
        while (i<j) {
            while ((i<j)&&(arr[j]>pivot)) {
                j--;
            }
            while ((i<j)&&(arr[i]<pivot)) {
                i++;
            }
            if ((arr[i]==arr[j])&&(i<j)) {
                i++;
            } else {
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i-1>start) arr=quick_sort(arr,start,i-1);
        if (j+1<end) arr=quick_sort(arr,j+1,end);
        return (arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        int matrix_x[] = new int[counter];
        int matrix_y[] = new int[counter];
        double matrix_tan[] = new double[counter];
        int res1 = 0;
        int res2 = 0;
        int m = 0;
        int min_x = Integer.MAX_VALUE;
        int min_y = 0;
        while (counter > 0) {
            matrix_x[m] = sc.nextInt();
            matrix_y[m] = sc.nextInt();
            m++;
            counter--;
        }
        for (int i = 0; i < matrix_x.length; i++) {
            min_x = getmin(min_x, matrix_x[i]);
        }
        for (int i = 0; i < matrix_x.length; i++) {
            if (min_x == matrix_x[i]) {
                min_y = matrix_y[i];
                break;
            }
        }
        for (int i = 0; i < matrix_x.length; i++) {
            if(matrix_x[i] == min_x && matrix_y[i] == min_y){
                matrix_tan[i] = Double.MIN_VALUE;
            }
            if (matrix_x[i] - min_x == 0 && matrix_y[i] != min_y) {
                matrix_tan[i] = Double.MAX_VALUE;
            }
            if (matrix_x[i] != min_x) {
                matrix_tan[i] = calculate_tan(matrix_y[i], min_y, matrix_x[i], min_x);
            }
        }
        double newmatrix_tan[] = quick_sort(matrix_tan,0,matrix_tan.length - 1);
        double res = newmatrix_tan[matrix_tan.length / 2];

        for(int i = 0; i < matrix_x.length; i++){
            if(min_x == matrix_x[i] && min_y == matrix_y[i]){
                res1 = i +1;
                break;
            }
        }
        for(int i = 0; i < matrix_x.length; i++){
            if( min_x - matrix_x[i]!= 0 &&res == calculate_tan(matrix_y[i], min_y, matrix_x[i], min_x)){
                res2 = i + 1;
                break;
            }
        }
        for (int i = 0; i < newmatrix_tan.length; i ++){
            System.out.println();
        }
        System.out.println(res);
        System.out.printf("%d %d",res1,res2);
    }
}




