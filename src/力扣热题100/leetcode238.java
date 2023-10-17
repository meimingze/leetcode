package 力扣热题100;

/**
 * @auther XMZ
 * @create 2023--17-上午10:06
 */
public class leetcode238 {
    public int[] productExceptSelf(int[] nums) {
        //法一
        //建造左右数组，分别储存最后再相乘
        int leftnum[] = new int[nums.length];
        int rightnum[] = new int[nums.length];
        int res[] = new int[nums.length];
        leftnum[0] = 1;
        rightnum[nums.length -1 ] = 1;
        for(int i = 1; i < nums.length; i++){
            leftnum[i] = leftnum[i -1]*nums[i -1];
        }
        for(int i = nums.length - 2; i >= 0; i--){
            rightnum[i] = rightnum[i + 1]*nums[i+1];
        }
        for(int i = 0; i < nums.length; i++){
            res[i] = leftnum[i] * rightnum[i];
        }
        return res;
    }
}
