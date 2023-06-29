package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    static class Tree{
        String data;
        Tree left;
        Tree right;

        public void setLeft(Tree left) {
            this.left = left;
        }

        public void setRight(Tree right) {
            this.right = right;
        }
    }

    public static void main(String[] args) {
        String pre;
        String mid;
        Scanner scanner = new Scanner(System.in);
        pre = scanner.next();
        mid = scanner.next();
        char[] pres = pre.toCharArray();
        char[] mids = mid.toCharArray();
        Tree tree = build(pres,mids);
        backFind(tree);
    }
    static Tree build(char[] pre, char[] mid){
        if(pre.length == 0 || mid.length == 0){
            return null;
        }
        Tree tree = new Tree();
        tree.data = String.valueOf(pre[0]);
        int index = search(0, mid.length, mid, pre[0]);
        tree.setLeft(build(Arrays.copyOfRange(pre,1,index+1),Arrays.copyOfRange(mid,0,index)));
        tree.setRight(build(Arrays.copyOfRange(pre,index+1,pre.length),Arrays.copyOfRange(mid,index+1,mid.length)));
        return  tree;
    }
    static int search(int start,int end, char[] array,char data){
        for (int i = start; i < end; i++) {
            if(array[i] == data){
                return i;
            }
        }
        return 0;
    }
    static void backFind(Tree tree){
        if(tree.left !=null){
            backFind(tree.left);
        }
        if(tree.right!= null){
            backFind(tree.right);
        }
        System.out.print(tree.data);
    }
}
