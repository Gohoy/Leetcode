import java.util.ArrayList;

public class niuke_037 {
    // 成功ac ，没有使用二叉搜索树的特性
//    ArrayList<Integer> pRoot = new ArrayList<>();
//    ArrayList<Integer> qRoot = new ArrayList<>();
//    ArrayList<Integer> temp = new ArrayList<>();
//    public int lowestCommonAncestor (TreeNode root, int p, int q) {
//        // write code here
////        if(root.val == p || root.val == q) return root.val;
//        preOrder(root, p , q);
//        for(int i = 0 ; i< pRoot.size() ; i++){
//            System.out.println(pRoot.get(i));
//        }
//        for(int i = 0 ; i< qRoot.size() ; i++){
//            System.out.println(qRoot.get(i));
//        }
//        int res = root.val;
//        for(int i = 1 ; i < Math.min(pRoot.size() , qRoot.size()); i ++){
//            if(pRoot.get(i).equals(qRoot.get(i))) res = pRoot.get(i);
//            System.out.println(qRoot.get(i));
//        }
//
//        return res;
//    }
//    public void preOrder(TreeNode root , int p , int q){
//        if(root == null) return;
//        temp.add(root.val);
//        preOrder(root.left , p, q);
//        preOrder(root.right, p, q);
//        if (root.val == p) pRoot = new ArrayList<>(temp);
//        if (root.val == q) qRoot = new ArrayList<>(temp);
//        temp.remove(temp.size()-1);
//    }
//    快21ms，内存多一点
    public int lowestCommonAncestor (TreeNode root, int p, int q) {
        if(root == null) return  -1;
        if(root.val == p || root.val == q){
            return root.val;
        }
        if(root.val < p){
            return lowestCommonAncestor(root.right , p , q);
        }
        if(root.val > q){
            return lowestCommonAncestor(root.left, p , q);
        }
        return root.val;
    }
}
