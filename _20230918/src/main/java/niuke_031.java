import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class niuke_031 {

//     使用树的三种遍历无法确定树的对称性


    // 使用bfs层级判断是否想等,维护一个队列
//    public boolean isSymmetrical(TreeNode pRoot) {
//        if (pRoot == null) {
//            return true;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(pRoot.left);
//        queue.offer(pRoot.right);
//        while (!queue.isEmpty()){
//            TreeNode left = queue.poll();
//            TreeNode right = queue.poll();
//            if(left == null && right == null) continue;
//            if(left ==null || right == null || right.val != left.val) return false;
//            queue.offer(left.left);
//            queue.offer(right.right);
//            queue.offer(left.right);
//            queue.offer(right.left);
//        }
//        return true;
//    }

    // bfs ,不维护队列 快一点点，内存多一点点
    public boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        return isSymmetricalHelper(pRoot.left, pRoot.right);
    }

    private boolean isSymmetricalHelper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val
                && isSymmetricalHelper(left.left, right.right)
                && isSymmetricalHelper(left.right, right.left);
    }
}
