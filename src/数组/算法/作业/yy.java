package 数组.算法.作业;

import java.util.Scanner;

public class yy {
    static int[] v = new int[8];
    // print the process of move

    public static void solve(int x, int t, int y) {
        while (v[x] > 0) {
            if (v[t] == 0) {
                v[t]++;
                v[y]++;
                print(t, y, false);
            }
            v[t]--;
            v[x]--;
            print(t, x, true);
        }
    }
    public static void print(int x, int y, boolean flag) {
        String s = "";
        // use asc mode
        s += (char) ('A' + x);
        s += (char) ('A' + y);
        if (flag) {
            System.out.println(s + "-");
        } else {
            System.out.println(s + "+");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            v[i] = sc.nextInt();
        }
        int l = v[0] + v[2] + v[5] + v[7];
        int r = v[1] + v[3] + v[4] + v[6];

        if (l != r) {
            System.out.println("IMPOSSIBLE");
            return;
        } else {
            solve(2 , 1, 0);
            solve(5, 4, 0);
            solve(7, 4, 0);
            solve(1, 0, 4);
            solve(3, 0, 4);
            solve(6, 7, 4);
            while (v[0] > 0) {
                print(0, 4, true);
                v[0]--;
            }
        }
    }
}