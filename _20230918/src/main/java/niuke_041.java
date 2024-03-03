import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class niuke_041 {
    // 构建完树再层序遍历
    public int[] solve (int[] preOrder, int[] inOrder) {
        // write code here
        TreeNode root = reConstructBinaryTree(preOrder,inOrder);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        while (!queue.isEmpty()){
            int size =queue.size();
            ArrayList<Integer> arrayList  = new ArrayList<>();
            for(int i = 0 ;i < size ; i ++){
                arrayList = new ArrayList<>();
                TreeNode temp = queue.poll();
                if(temp == null) continue;
                arrayList.add(temp.val);
                if(temp.left != null) queue.offer(temp.left);
                if(temp.right != null) queue.offer(temp.right);
            }
            arrayLists.add(arrayList);
        }
        int[] res = new int[arrayLists.size()];
        for(int i = 0 ; i < arrayLists.size() ; i++){
            res[i] = arrayLists.get(i).get(arrayLists.get(i).size()-1);
        }
        return res;
    }

    public static TreeNode reConstructBinaryTree(int[] preOrder, int[] vinOrder) {
        if (preOrder == null  || preOrder.length == 0  ) {
            return null;
        }
        if(preOrder.length == 1) {
            return new TreeNode(preOrder[0]);
        }
        int rootIndex = 0;
        for(int i = 0 ; i < vinOrder.length; i ++){
            if(vinOrder[i] == preOrder[rootIndex]) {
                rootIndex = i;
                break;
            }
        }
        TreeNode root = new TreeNode(preOrder[0]);
        root.left = reConstructBinaryTree(Arrays.copyOfRange(preOrder,1,rootIndex+1),Arrays.copyOfRange(vinOrder,0,rootIndex));
        root.right = reConstructBinaryTree(Arrays.copyOfRange(preOrder,rootIndex+1,preOrder.length),Arrays.copyOfRange(vinOrder,rootIndex+1,vinOrder.length));
        return root;
    }
}
