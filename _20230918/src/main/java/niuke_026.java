import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class niuke_026 {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
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
        return res;
    }
}
