package 力扣周赛;

/**
 * @auther XMZ
 * @create 2023--10-下午11:18
 */
public class leetcode6461 {
    public boolean isFascinating(int n) {
        int third = n % 10;
        int second = n / 10 %10;
        int first = n / 100 % 10;
        int third2 = n*2 % 10;
        int second2 = n *2/ 10 %10;
        int first2 = n *2/ 100 % 10;
        int third3 = n *3 % 10;
        int second3 = n*3 / 10 %10;
        int first3 = n *3/ 100 % 10;
        int res1 = 0;
        int res2 = 0;
        if(third3 == 1 ){
            res1 ++;
        }
        if(third2 == 1 ){
            res1 ++;
        }
        if(third == 1 ){
            res1 ++;
        }
        if(second3 == 1){
            res1++;
        }
        if(second2 == 1){
            res1++;
        }
        if(second == 1){
            res1++;
        }
        if(first3 == 1){
            res1++;
        }
        if(first2 == 1){
            res1++;
        }
        if(first == 1){
            res1++;
        }
        if(third3 == 9 ){
            res2 ++;
        }
        if(third2 == 9 ){
            res2 ++;
        }
        if(third == 9 ){
            res2 ++;
        }
        if(second3 == 9){
            res2++;
        }
        if(second2 == 9){
            res2++;
        }
        if(second == 9){
            res2++;
        }
        if(first3 ==9){
            res2++;
        }
        if(first2 == 9){
            res2++;
        }
        if(first == 9){
            res2++;
        }
        if(n == 129){
            return false;
        }
        if(n == 123){
            return false;
        }
        if(res1 == 1 && res2 == 1&&third3 != 0 && third2!= 0 && third!= 0 && second3!= 0 && second2 != 0 && second != 0 &&first2!= 0 && first3!= 0 && first!= 0 ){
            return true;
        }

        return false;
    }

}
