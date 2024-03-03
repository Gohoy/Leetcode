public class niuke_036 {

    // cao 写错了，写成了必须是完全二叉树并且左右两个节点大小差不大于1
//    public boolean IsBalanced_Solution (TreeNode pRoot) {
//        // write code here
//        if(pRoot == null) return true;
//        return  ((pRoot.right == null && pRoot.left == null) || (((pRoot.right != null) && (pRoot.left != null)) && (Math.abs(pRoot.right.val - pRoot.left.val) <= 1) )) && IsBalanced_Solution(pRoot.left) && IsBalanced_Solution(pRoot.right);
//    }

    public boolean IsBalanced_Solution (TreeNode pRoot) {
        if(pRoot == null) return true;
        return isBalance(pRoot) && isBalance(pRoot.right) && isBalance(pRoot.left);
    }
    public  boolean isBalance (TreeNode root){
        if(root == null) return true;
        return Math.abs(countHeight(root.left) - countHeight(root.right)) <= 1;
    }
    public int countHeight (TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(countHeight(root.left) , countHeight(root.right));
    }
}
