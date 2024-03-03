import java.util.ArrayList;

public class niuke_030 {
    // 中序遍历，得到结果在构建成双链表
//    public static TreeNode Convert(TreeNode pRootOfTree) {
//        if(pRootOfTree == null) return null;
//        ArrayList<TreeNode> treeNodes = new ArrayList<>();
//        inorder(pRootOfTree , treeNodes);
//        for(int i = 1 ; i < treeNodes.size() ; i ++){
//            treeNodes.get(i-1).right = treeNodes.get(i);
//            treeNodes.get(i).left = treeNodes.get(i-1);
//        }
//        return treeNodes.get(0);
//    }
//    public static void inorder(TreeNode root , ArrayList<TreeNode> treeNodes){
//        if(root == null) return ;
//        if(root.left != null){
//            inorder(root.left, treeNodes);
//        }
//        treeNodes.add(root);
//        System.out.println(root.val);
//        if(root.right != null){
//            inorder(root.right, treeNodes);
//        }
//    }

    // 在中序遍历的过程中就进行直接构建 ,快了一点点，内存反而占用更高

    static TreeNode pre = null;
    public static TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) return null;
        Convert(pRootOfTree.right);
        if(pre != null){
            pRootOfTree.right = pre;
            pre.left = pRootOfTree;
        }
        pre = pRootOfTree;
        Convert(pRootOfTree.left);
        return pre;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left= new TreeNode(3);
        root.left.left.left= new TreeNode(2);
        root.left.left.left.left= new TreeNode(1);
        Convert(root);
    }
}
