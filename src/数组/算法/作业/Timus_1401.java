package 数组.算法.作业;
import java.util.Scanner;
/**
 * @auther XMZ
 * @create 2023--12-下午7:22
 */
public class Timus_1401 {

    static int spand = 3;
    static int[][] matrix = new int[512][512];

    public static void generate(int n, int x, int y, int hx, int hy) {
        if (n == 2) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (x + i != hx || y + j != hy) {
                        matrix[x + i][y + j] = spand++ / 3;
                    }
                }
            }
            return;
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (x + i * n / 2 > hx || hx >= x + i * n / 2 + n / 2 || y + j * n / 2 > hy || hy >= y + j * n / 2 + n / 2) {
                    matrix[x + n / 2 - 1 + i][y + n / 2 - 1 + j] = spand++ / 3; // Middle triangle
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (x + i * n / 2 <= hx && hx < x + i * n / 2 + n / 2 && y + j * n / 2 <= hy && hy < y + j * n / 2 + n / 2) {
                    generate(n / 2, x + i * n / 2, y + j * n / 2, hx, hy); // Block contains the hole
                } else { // Does not contain the hole
                    generate(n / 2, x + i * n / 2, y + j * n / 2, x + n / 2 - 1 + i, y + n / 2 - 1 + j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int px = scanner.nextInt();
        int py = scanner.nextInt();
        int s = (int) Math.pow(2, n);
        generate(s, 0, 0, px - 1, py - 1);
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


