import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class niuke_027 {
    public static ArrayList<ArrayList<Integer>> Print (TreeNode root) {
        if(root == null) return new ArrayList<>();
        // write code here
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        while (queue.size() != 0){
            int size = queue.size();
            ArrayList<Integer> tempArray =  new ArrayList<>();
            for(int i = 0 ; i < size; i ++){
                TreeNode tempNode = queue.poll();
                tempArray.add(tempNode.val);
                    if(tempNode.left != null){
                        queue.add(tempNode.left);
                    }
                    if(tempNode.right != null){
                        queue.add(tempNode.right);
                    }
            }
            res.add(tempArray);
        }
        for(int i = 0 ; i < res.size() ; i ++){
            if(i % 2 ==1){
                Collections.reverse(res.get(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        Print(root);
    }
}
