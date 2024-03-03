import java.util.ArrayList;

public class niuke_038 {
//    可以ac  1424ms	65556KB
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

    // 时间和内存优化都相当大347ms	38992KB
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        // write code here
        if(root == null) return -1;
        if(root.val == o1 || root.val == o2) return  root.val;
        int left =  lowestCommonAncestor(root.left , o1 , o2);
        int right = lowestCommonAncestor(root.right , o1, o2);
//        如果分支没找到就返回了null，如果找到了就返回了找到的分支
        if(left >= 0 && right >=0){
            return root.val;
        }else if(left > 0){
            return left;
        }else {
            return right;
        }
    }
}
