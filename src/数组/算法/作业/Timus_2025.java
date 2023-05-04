package 数组.算法.作业;

import java.util.Scanner;

/**
 * @auther XMZ
 * @create 2023--12-下午3:40
 */
public class Timus_2025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] soldierNumber = new int[n];
        int[] groupNumber = new int[n];
        for(int i = 0; i < n; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            soldierNumber[i] = a;
            groupNumber[i] = b;
        }
        for(int i = 0; i < n; i++){
            System.out.println(findMaxfights(soldierNumber[i],groupNumber[i]));
        }
    }
    public static int findMaxfights(int soldierNumber,int groupNumber){
        int maxFigths = 0;
        int everygroupsoldier = soldierNumber / groupNumber;// 此变量为均分的组
        int lostsodlier = soldierNumber % groupNumber; // 此变量为均分后剩下的组
        maxFigths = (soldierNumber * (soldierNumber - 1))/2 - (groupNumber-lostsodlier)*(everygroupsoldier * (everygroupsoldier-1)/2) - lostsodlier*((everygroupsoldier+1)*everygroupsoldier/2);
        return maxFigths;
    }
}
