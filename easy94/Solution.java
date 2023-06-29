package easy94;

import java.util.ArrayList;
import java.util.List;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        loop(root);
        return list;
    }
    public  void loop(TreeNode root ){
        if(root == null) return ;
        if(root.left != null){
            inorderTraversal(root.left);
        }
        list.add(root.val);
        if(root.right != null){
            inorderTraversal(root.right);
        }
    }

}