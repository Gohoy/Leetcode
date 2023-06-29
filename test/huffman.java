package test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class huffman {
    static int sum0 = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n ;
        n = scanner.nextInt();
        ArrayList<Node> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            sum0 += x;
            list.add( new Node(x));
        }
      while (list.size()>1){
          Collections.sort(list);
          Node left = list.get(0);
          Node right = list.get(1);
          Node parent = new Node(left.data+right.data);
          parent.left = left;
          parent.right = right;
          list.add(parent);
          list.remove(left);
          list.remove(right);
      }
        Node node = list.get(0);
        pre(node);
        System.out.println(sum-sum0);
    }
    static int sum = 0;
    static void pre(Node node){
//        System.out.println(node.data);
        sum += node.data;
        if(node.left!=null){
            pre(node.left);
        }
        if(node.right!=null){
            pre(node.right);
        }
    }
    static class Node implements Comparable<Node>{
        public void setData(int data) {
            this.data = data;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }
       public Node(int i){
            this.data = i;
        }


        int data;
        Node left;
        Node right;
        Node parent;

        @Override
        public int compareTo(Node node) {
            return this.data-node.data;
        }
    }
}
