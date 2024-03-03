public class niuke_033 {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        changeChild(pRoot);
        return pRoot;
    }
    public void changeChild ( TreeNode root){
        if(root == null) return;
        changeChild(root.left);
        changeChild(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
