package 每日一题;

/**
 * @auther XMZ
 * @create 2023--25-上午9:00
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;this.left = left;this.right = right;
   }
}
public class leetcode1448 {
    public int goodNodes(TreeNode root) {
        return dfs(root,Integer.MIN_VALUE);
    }
    public int dfs(TreeNode root, int pathMax){
        if(root == null){
            return 0;
        }
        int res = 0;
        if(root.val >= pathMax){
            res++;
            pathMax =  root.val;
        }
        res += dfs(root.left,pathMax) + dfs(root.right,pathMax);
        return res;
    }
}
