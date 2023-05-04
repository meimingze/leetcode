package 数组.算法.作业;

import java.util.Scanner;

/**
 * @auther XMZ
 * @create 2023--04-下午4:36
 */
class Listnode{
    int val;
    Listnode next;
    Listnode(int x){
        val = x;
        next = null;
    }
}
public class Timus_1521 {
    public static void main(String[] args) {
        Listnode head = null;
        Scanner sc = new Scanner(System.in);
        int totalnumber = sc.nextInt();
        int jumpnodenumber = sc.nextInt();
        int i = 1;
        while(totalnumber > 0){
            head.val = i;
            i++;
            head = head.next;
        }
        for(int j =0; j < totalnumber; j ++){
            System.out.println(head.val);
            head = head.next;
        }

    }
}
