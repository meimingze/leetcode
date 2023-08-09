package leetcode;

/**
 * @auther XMZ
 * @create 2023--09-上午9:38
 */
public class leetcode1281 {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int ji = 1;
        while( n > 0)
        {
            sum += n % 10;
            ji *= n % 10;
            n = n /10;
        }
        return ji-sum;
    }
    }

