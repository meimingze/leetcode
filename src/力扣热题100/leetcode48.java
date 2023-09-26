package 力扣热题100;

/**
 * @auther XMZ
 * @create 2023--17-上午11:58
 */
public class leetcode48 {
    /* public int trap(int[] height) {
         // 首先我们逐层考虑，一层一层相加，最后再减去实心部分即可
         //找到最高层数
         //若找到有水，则更新ans，否则只有temp_anx会变化
         int maxheight = 0;
         for(int i = 0; i < height.length; i++){
             maxheight = Math.max(height[i],maxheight);
         }
         int ans = 0;
         for(int i = 1; i <= maxheight; i++){
             boolean isFlag = false;
             int temp_ans = 0;
             for(int j = 0; j < height.length; j++){
                 if(height[j] >= i){
                     ans += temp_ans;
                     isFlag = true;
                 }
                 if(isFlag && height[j] < i){
                     temp_ans++;
                 }
             }
         }
         return ans;
     }*/
    public int trap(int[] height) {
        int sum = 0;
        for(int i = 1; i < height.length; i++){
            int max_left = 0;
            int max_right = 0;
            for(int j = i -1; j >= 0; j -- ){
                if(height[j] >= max_left){
                    max_left = height[j];
                }
            }
            for(int j = i + 1; j < height.length; j++){
                if(height[j] >= max_right){
                    max_right = height[j];
                }
            }
            int min = Math.min(max_right,max_left);
            if(min > height[i]){
                sum += min -height[i];
            }
        }
        return sum;
    }
}
