package 力扣热题100;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther XMZ
 * @create 2023--31-9:59
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left , TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class leetcode94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        zhongxubianli(root,result);
        return  result;
    }
    public void zhongxubianli(TreeNode cur, List<Integer> save){
        if(cur == null){
            return;
        }
        zhongxubianli(cur.left, save);
        save.add(cur.val);
        zhongxubianli(cur.right, save);
    }
}
