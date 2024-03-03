import java.util.ArrayList;

public class niuke_024 {
    public int[] inorderTraversal (TreeNode root) {
        // write code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        inorder(root,res);
        int[] re = new int[res.size()];
        for(int i = 0 ; i < res.size() ; i ++){
            re[i] = res.get(i);
        }
        return  re;
    }

    public static  void inorder(TreeNode root , ArrayList<Integer> res){
        if(root == null) return ;
        if(root.left != null){
            inorder(root.left , res);
        }
        res.add(root.val);
        if(root.right != null){
            inorder(root.right , res);
        }
    }
}
