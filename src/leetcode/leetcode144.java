package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode144 {
}
class TreeNode1{
    int val;
    TreeNode1 left;
    TreeNode1 right;
    public TreeNode1(int val){
        this.val = val;
    }
    public TreeNode1(int val, TreeNode1 left, TreeNode1 right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution49 {
    public List<Integer> preorderTraversal(TreeNode1 root) {
        List<Integer> result  = new ArrayList<Integer>();
        preOrderRec(root,result);
        return result;
    }
    public void preOrderRec(TreeNode1 head, List<Integer> result){
        if(head == null){
            return;
        }
        result.add(head.val);
        preOrderRec(head.left,result);
        preOrderRec(head.right,result);
    }
}