package 数组.算法.移除元素;

//844. 比较含退格的字符串
//给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。
//
//注意：如果对空文本输入退格字符，文本继续为空。
public class leetcode844_easy {
    public static void main(String[] args) {
        Solution844 sl = new Solution844();
        String s = "ab#c";
        String t = "a##c";
        System.out.println(sl.backspaceCompare(s,t));

    }
}
class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        //#为退格，所以我们逆序遍历，则为进格
        int slength = s.length() - 1;
        int tlength = t.length() - 1;
        int skips = 0;
        int skipt = 0;
        while(slength >= 0 || tlength >= 0){
            //处理#问题：需要保证当多个##相连时，可多次退格，故需要在while循环中实现，不能简单的i= i-2；
            while(slength >= 0){
                if(s.charAt(slength) == '#'){
                    skips++;
                    slength--;
                }else if(skips > 0){
                    slength--;
                    skips--;
                }else {
                    break;
                }
            }
            while(tlength >= 0){
                if(t.charAt(tlength) == '#'){
                    skipt++;
                    tlength--;
                }else if(skipt > 0){
                    tlength--;
                    skipt--;
                }else {
                    break;
                }
            }
            /*if(s.charAt(slength) == '#' {
                slength = slength - 2;
            }
            if(t.charAt(tlength) == '#'){
                tlength = tlength - 2;
            }*/
            //情况一：字母不相同
            if(slength >= 0 && tlength >= 0){
                if(s.charAt(slength) != t.charAt(tlength)){
                    return false;
                }
            }else {
                //情况二：s与t中的字符串长度不同
                if (slength >= 0 || tlength >= 0) {
                    return false;
                }
            }
            slength--;
            tlength--;
        }
        return true;

    }
}
