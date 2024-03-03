import java.util.ArrayList;

public class niuke_034 {
    //         中序遍历大小有序
//    public boolean isValidBST(TreeNode root) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        inorder(root,arrayList);
//        for(int i = 1; i < arrayList.size() ; i ++){
//            if(arrayList.get(i) > arrayList.get(i-1)){
//                continue;
//            }
//            return false;
//        }
//        return true;
//    }
//
//    public void inorder(TreeNode root, ArrayList<Integer> arrayList) {
//        if (root == null) return;
//        inorder(root.left, arrayList);
//        arrayList.add(root.val);
//        inorder(root.right, arrayList);
//
//    }

//    中序遍历的过程中判断,稍微快一些，内存占用小一些
    int pre = Integer.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {

        if(root == null) return true;
        if(!isValidBST(root.left)) return false;
        if(root.val < pre) return false;
        pre = root.val;
        if(!isValidBST(root.right)) return false;
        return true;
    }
}
