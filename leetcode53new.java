public class leetcode53new {
    public int maxAbsoluteSum(int[] nums) {
        //找到正向的最大值
        int length = nums.length;
        int dpfirsit[] = new int[length];
        dpfirsit[0] = nums[0];
        int dpsecond[] = new int[length];
        dpsecond[0] = nums[0];
        int resultfirst = nums[0];
        int resultsecond = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            if(dpfirsit[i-1] > 0){
                dpfirsit[i] = dpfirsit[i-1] +nums[i];
            }else{
                dpfirsit[i] = nums[i];
            }
            resultfirst = Math.max(resultfirst,dpfirsit[i]);
        }
        for(int i = 1; i < nums.length; i++){
            if(dpsecond[i-1] < 0){
                dpsecond[i] = dpsecond[i-1] + nums[i];
            }else{
                dpsecond[i] = nums[i];
            }
            resultsecond = Math.min(resultsecond,dpsecond[i]);
        }
        int res;
        return  res = resultfirst > -resultsecond ? resultfirst : -resultsecond;
    }
}
