public class niuke_028 {
    public int maxDepth (TreeNode root) {
        if(root == null) return 0;
        // write code here
        return maxDepthBranch(root) + 1;
    }
    public int maxDepthBranch (TreeNode root){
        if(root == null) return 0;
        if(root.left != null || root.right != null) return Math.max( maxDepthBranch(root.left), maxDepthBranch(root.right)) + 1;
        return 0;
    }
}
