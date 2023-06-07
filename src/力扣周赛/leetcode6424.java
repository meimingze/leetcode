package 力扣周赛;

/**
 * @auther XMZ
 * @create 2023--04-下午2:47
 */
public class leetcode6424 {
    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        int first = 0;
        int last = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                first = i;
                break;
            }
        }
        for(int i =n-1 ; i>0; i--){
            if(nums[i] == n){
                last = i;
            }
        }
        int res = first+n-last;
        if(first == last - 1){
            res --;
        }
        return res;
    }
}
