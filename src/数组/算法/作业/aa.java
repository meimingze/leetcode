package 数组.算法.作业;

import java.util.ArrayList;
import java.util.Scanner;
public class aa {
    public static void main(String[] args) {
        ArrayList<String> res = new ArrayList<String>();
        int n = 0;
        int savematrix[] = new int[8];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 8; i++){
            int a = sc.nextInt();
            savematrix[i] = a;
        }
        if(savematrix[0] + savematrix[2] + savematrix[5]+savematrix[7] != savematrix[1]+savematrix[3]+savematrix[4]+savematrix[6]){
            System.out.println("IMPOSSIBLE");
        }else{
            if(savematrix[2] > 0){
                for(int i = 0; i < savematrix[2]; i++){
                    res.add("AB+");
                    res.add("BC-");
                }
                savematrix[0] += savematrix[2];
                savematrix[2] = 0;
            }
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
            if(savematrix[3] > 0 && savematrix[0] >= savematrix[3]){
                savematrix[0] -= savematrix[3];
                for(int i = 0; i < savematrix[3]; i ++){
                    System.out.println("AD-");
                }
                savematrix[3] = 0;
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
            if(savematrix[6] > 0){
                for(int i = 0; i < savematrix[6]; i++){
                    res.add("EF+");
                    res.add("FG-");
                }
                savematrix[4] += savematrix[6];
                savematrix[6] = 0;
            }
            if(savematrix[5] > 0 && savematrix[4] >= savematrix[5]){
                savematrix[4] -= savematrix[5];
                for(int i = 0; i < savematrix[5]; i++){
                    res.add("EF-");
                }
                savematrix[5] = 0;
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
            if(savematrix[7] > 0 && savematrix[4] >= savematrix[7]){
                savematrix[4] -= savematrix[7];
                for(int i = 0; i < savematrix[7]; i++){
                    res.add("EH-");
                }
                savematrix[7] = 0;
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
            if(savematrix[0] >0 && savematrix[4] > 0){
                for(int i = 0;i < savematrix[0]; i++){
                    res.add("AE-");
                }
            }
            for(int i = 0; i < res.size(); i++){
                String s = res.get(i);
                System.out.println(s);
            }
        }
    }
}