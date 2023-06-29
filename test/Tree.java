package test;

import java.util.Arrays;

public class Tree {

    private int data;
    private Tree left;
    private Tree right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }

    public Tree(final int data) {
        this(data, null, null);
    }

    public Tree(final int data, final Tree left, final Tree right) {
        this.data = data;
        this.left = left;
        this.right = right;

    }

    public static void main(String args[]) {
        int[] preOrders = new int[] {1,2,3};
        int[] inOrders = new int[] {2,1,3};
        Tree tree = buildTree(preOrders, inOrders);
        backFind(tree);
    }

    private static Tree buildTree(int[] preOrders, int[] inOrders) {
        if (preOrders.length == 0 || inOrders.length == 0) {
            return null;
        }
        Tree tree = new Tree(preOrders[0]);
        int index = search(0, inOrders.length, inOrders, tree.getData());
        tree.setLeft(buildTree(Arrays.copyOfRange(preOrders, 1, index + 1), Arrays.copyOfRange(inOrders, 0, index)));
        tree.setRight(buildTree(Arrays.copyOfRange(preOrders, index + 1, preOrders.length),
                Arrays.copyOfRange(inOrders, index + 1, inOrders.length)));
        return tree;
    }

    private static int search(int start, int end, int[] inOrders, int data) {
        for (int i = start; i < end; i++) {
            if (data == inOrders[i]) {
                return i;
            }
        }
        return -1;
    }

    static void backFind(Tree tree){

        if(tree.left != null){
            backFind(tree.left);
        }
        if(tree.right != null){
            backFind(tree.right);
        }

        System.out.println(tree.data+ " ");

    }
}