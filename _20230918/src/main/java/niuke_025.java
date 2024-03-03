import java.util.ArrayList;

public class niuke_025 {
    public int[] postorderTraversal (TreeNode root) {
        // write code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        postorder(root,res);
        int[] re = new int[res.size()];
        for(int i = 0 ; i < res.size() ; i ++){
            re[i] = res.get(i);
        }
        return  re;
    }

    public static  void postorder(TreeNode root , ArrayList<Integer> res){
        if(root == null) return ;
        if(root.left != null){
            postorder(root.left , res);
        }
        if(root.right != null){
            postorder(root.right , res);
        }
        res.add(root.val);
    }
}
