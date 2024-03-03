import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class niuke_035 {
    //可以ac，用arraylist bfs存储每一层的个数，如果遇到不是的情况就在arraylist加上-1，最后通过arraylist倒数第二个数是不是2的n-1次方来判断。
//    public boolean isCompleteTree (TreeNode root) {
//        // write code here
//        bfs(root);
//        if(arrayList.size() == 1) return true;
//        return arrayList.get(arrayList.size()-2) == Math.pow(2,arrayList.size()-2);
//    }
//    ArrayList<Integer> arrayList = new ArrayList<>();
//    public void bfs (TreeNode root){
//        if(root == null) return;
//        Queue<TreeNode> queue= new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            arrayList.add(size);
//            for(int i =0 ; i < size ; i ++){
//                TreeNode temp = queue.poll();
//                if(temp == null) continue;
//                if(temp.left == null && temp.right != null){
//                    arrayList.add(-1);
//                }
//                if(temp.left != null && temp.right != null){
//                    if( (temp.left.left == null || temp.left.right == null) && (temp.right.left !=null || temp.right.right != null) ){
//                        arrayList.add(-1);
//                    }
//                }
//                if(temp.left != null) queue.add(temp.left);
//                if(temp.right != null) queue.add(temp.right);
//            }
//        }
//    }

    // bfs使用flag标志是否有null值出现，如果已经有null 并且后面还有值，则不是完全的。
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        boolean hasNull = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                hasNull = true;
                continue;
            }
            if (hasNull) return false;
            queue.offer(node.left);
            queue.offer(node.right);
        }
        return true;
    }

}


