import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class niuke_039 {
    // 层序遍历
    String Serialize(TreeNode root) {
        if(root == null) return "";
        Queue<TreeNode > queue = new LinkedList<>();
        queue.offer(root);
        StringBuilder stringBuilder = new StringBuilder();
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0 ; i < size; i ++){
                TreeNode temp = queue.poll();
                if(temp == null) {
                    stringBuilder.append('#').append(',');
                    continue;
                }
                stringBuilder.append(temp.val).append(',');
                queue.offer(temp.left);
                queue.offer(temp.right);
            }
        }
       return stringBuilder.toString();
    }

    TreeNode Deserialize(String str) {
        if(str == null || str.isEmpty()) return null;
        String[] nodes = str.split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(!nodes[i].equals("#")){
                temp.left = new TreeNode(Integer.parseInt(nodes[i]));
                queue.offer(temp.left);
            }
            i ++;
            if(!nodes[i].equals("#")){
                temp.right = new TreeNode(Integer.parseInt(nodes[i]));
                queue.offer(temp.right);
            }
            i++;
        }
        return root;
    }
}
