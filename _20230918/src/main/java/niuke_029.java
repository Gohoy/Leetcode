import java.util.ArrayList;

public class niuke_029 {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        // write code here
        ArrayList<Integer> pathSums = new ArrayList<>();
        if(root.left == null && root.right == null && root.val == sum) return true;
        if(root.left != null){
            getPathSum(root.left, root.val, sum, pathSums);
        }
        if(root.right != null){
            getPathSum(root.right, root.val, sum, pathSums);
        }
        return pathSums.contains(sum);
    }

    public static void getPathSum(TreeNode root, int pathSum, int sum, ArrayList<Integer> pathSums) {
        if (root == null) {
            pathSums.add(pathSum);
            return;
        }
        pathSum += root.val;
        getPathSum(root.left, pathSum, sum, pathSums);
        getPathSum(root.right, pathSum, sum, pathSums);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        boolean b = hasPathSum(root, 1);
        System.out.println(b);
    }
}
