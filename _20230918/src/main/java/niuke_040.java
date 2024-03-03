import java.util.Arrays;

public class niuke_040 {
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

    public static void main(String[] args) {
        int[] preOrder = {1,2,4,7,3,5,6,8};
        int[] inOrder = {4,7,2,1,5,3,8,6};
        reConstructBinaryTree(preOrder,inOrder);
    }

}
