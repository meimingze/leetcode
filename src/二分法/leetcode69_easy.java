package 二分法;
//69. x 的平方根
//给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
//由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
//注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
public class leetcode69_easy {
    public static void main(String[] args) {

    }
}
class Solution69 {
    public int mySqrt(int x) {
        int left = 0;//左边界为0
        int right = x;//右边界为x本身
        int res;
        while(left<=right){
            int mid = left+(right-left)/2;
            if((long)mid * mid ==x){
                return mid;
            }
            if(mid*mid > x){
                right = mid - 1;
            }
            if(mid*mid < x){
                left = mid+1;
            }
        }
        return 0;
    }
}
