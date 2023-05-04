package 数组.算法.作业;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther XMZ
 * @create 2023--19-下午12:07
 */
public class yituodabian {
    static final double eps = 1e-6;
    static class Point {
        double x;
        double y;
        int id;
    }

    static double cross(Point a, Point b, Point p) {
        return ((a.x - p.x) * (b.y - p.y)) - ((a.y - p.y) * (b.x - p.x));
    }

    static boolean angcmp(Point a, Point b, Point[] p) {
        return cross(a, b, p[0]) > eps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] p = new Point[n];
        int t = 0;
        for (int i = 0; i < n; ++i) {
            p[i] = new Point();
            p[i].x = sc.nextDouble();
            p[i].y = sc.nextDouble();
            p[i].id = i + 1;
            if (p[i].x < p[t].x || (p[i].x == p[t].x && p[i].y < p[t].y))
                t = i;
        }
        Point temp = p[0];
        p[0] = p[t];
        p[t] = temp;
        Arrays.sort(p, 1, n, (a, b) -> angcmp(a, b, p) ? -1 : 1);
        System.out.println(p[0].id + " " + p[n / 2].id);
    }
}