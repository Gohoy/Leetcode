import java.util.ArrayList;

public class niuke_023 {

    public static void preorder(TreeNode root, ArrayList<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        if (root.left != null) {
            preorder(root.left, res);
        }
        if (root.right != null) {
            preorder(root.right, res);
        }
    }

    public int[] preorderTraversal(TreeNode root) {
        // write code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        preorder(root, res);
        int[] re = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            re[i] = res.get(i);
        }
        return re;
    }
}

