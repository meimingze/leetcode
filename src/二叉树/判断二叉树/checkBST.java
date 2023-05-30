package 二叉树.判断二叉树;

import 二叉树.前中后序遍历_广度遍历.Treenode;

/**
 * @auther XMZ
 * @create 2023--16-下午4:04
 */
// 判断是否为二叉搜索树
public class checkBST {
    public static int preValue = Integer.MIN_VALUE;
    public static boolean checkBST(Treenode.Node head){
        if(head == null){
            return true;
        }
        boolean isLeftBst = checkBST(head.left);
        if(!isLeftBst){
            return false;
        }
        if(head.val <= preValue){
            return false;
        }else{
            preValue = head.val;
        }
        return checkBST(head.right);
    }

}

