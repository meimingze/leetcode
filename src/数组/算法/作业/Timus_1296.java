package 数组.算法.作业;
import java.util.Scanner;
/**
 * @auther XMZ
 * @create 2023--05-下午11:28
 */

public class Timus_1296 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int matrix[] = new int[a];
            int max = 0;
            int sum = 0;
            for (int i = 0; i < a; i++) {
                matrix[i] = sc.nextInt();
            }
            for (int i = 0; i < a; i++) {
                if (sum + matrix[i] <= 0) {
                    sum = 0;
                } else {
                    sum = sum + matrix[i];
                }
                if (max < sum) {
                    max = sum;
                }
            }
            System.out.println(max);
        }
    }

