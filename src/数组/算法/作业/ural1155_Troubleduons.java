package 数组.算法.作业;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @auther XMZ
 * @create 2023--29-14:21
 */
public class ural1155_Troubleduons {
    public static void main(String[] args) {
        ArrayList<String> res = new ArrayList<String>();
        int n = 0;
        int savematrix[] = new int[8];
        Scanner sc = new Scanner(System.in);
        // 保存数组
        for(int i = 0; i < 8; i++){
            int a = sc.nextInt();
            savematrix[i] = a;
            System.out.println(savematrix[i]);
        }
        // 判断是否可以消除11
        if(savematrix[0] + savematrix[2] + savematrix[5]+savematrix[7] != savematrix[1]+savematrix[3]+savematrix[4]+savematrix[6]){
            System.out.println("IMPOSSIBLE");
            return;
        }else{
            // 关于 A
            // 首先考虑C（matrix[0]与matrix[2]走ABC）
            if(savematrix[2] > 0){
                for(int i = 0; i < savematrix[2]; i++){
                    res.add("AB+");
                    res.add("BC-");
                }
                savematrix[0] += savematrix[2];
                savematrix[2] = 0;
            }
            // 考虑B
            //1.A>=B
            if(savematrix[1] > 0 && savematrix[0] >= savematrix[1]){
                savematrix[0] -= savematrix[1];
                for(int i = 0; i < savematrix[1]; i++){
                    res.add("AB-");
                }
                savematrix[1] = 0;
                //2.A<B
            }
            if (savematrix[1] > 0 && savematrix[0] < savematrix[1]) {
                for(int i = 0; i < savematrix[1] - savematrix[0]; i++){
                    res.add("AE+");
                }
                savematrix[4] += savematrix[1] - savematrix[0];
                for(int i = 0; i < savematrix[1]; i ++){
                    res.add("AB-");
                }
                savematrix[0] = 0;
                savematrix[1] = 0;
            }
            //考虑D
            //3.A >= D
            if(savematrix[3] > 0 && savematrix[0] >= savematrix[3]){
                savematrix[0] -= savematrix[3];
                for(int i = 0; i < savematrix[3]; i ++){
                    System.out.println("AD-");
                }
                savematrix[3] = 0;
                //A < D
            }
            if (savematrix[3] > 0 && savematrix[0] < savematrix[3]) {
                for(int i = 0; i < savematrix[3] - savematrix[0];i++){
                    res.add("AE+");
                }
                savematrix[4] += savematrix[3] - savematrix[0];
                for(int i = 0; i < savematrix[1]; i ++){
                    res.add("AD-");
                }
                savematrix[0] = 0;
                savematrix[3] = 0;

            }
            //关于E
            // 首先考虑G（matrix[0]与matrix[6]走EFG）
            if(savematrix[6] > 0){
                for(int i = 0; i < savematrix[6]; i++){
                    res.add("EF+");
                    res.add("FG-");
                }
                savematrix[4] += savematrix[6];
                savematrix[6] = 0;
            }
            // 考虑F
            //1.E>=F
            if(savematrix[5] > 0 && savematrix[4] >= savematrix[5]){
                savematrix[4] -= savematrix[5];
                for(int i = 0; i < savematrix[5]; i++){
                    res.add("EF-");
                }
                savematrix[5] = 0;

                //2.E<F
            }
            if (savematrix[5] > 0 && savematrix[4] < savematrix[5]) {
                for(int i = 0; i < savematrix[5] - savematrix[4]; i++){
                    res.add("AE+");
                }
                savematrix[0] += savematrix[5] - savematrix[4];
                for(int i = 0; i < savematrix[5]; i ++){
                    res.add("EF-");
                }
                savematrix[4] = 0;
                savematrix[5] = 0;
            }
            // 考虑H
            //1.E>=H
            if(savematrix[7] > 0 && savematrix[4] >= savematrix[7]){
                savematrix[4] -= savematrix[7];
                for(int i = 0; i < savematrix[7]; i++){
                    res.add("EH-");
                }
                savematrix[7] = 0;
                //2.E<F
            }
            if (savematrix[7] > 0 && savematrix[4] < savematrix[7]) {
                for(int i = 0; i < savematrix[7] - savematrix[4]; i++){
                    res.add("AE+");
                }
                savematrix[0] += savematrix[7] - savematrix[4];
                for(int i = 0; i < savematrix[7]; i ++){
                    res.add("EH-");
                }
                savematrix[4] = 0;
                savematrix[7] = 0;
            }
            // 所有都处理完毕，最后处理A和E
            if(savematrix[0] >0 && savematrix[4] > 0){
                for(int i = 0;i < savematrix[0]; i++){
                    res.add("AE-");
                }
            }
            //最后遍历结果
            for(int i = 0; i < res.size(); i++){
                String s = res.get(i);
                System.out.println(s);
            }
        }
    }
}
