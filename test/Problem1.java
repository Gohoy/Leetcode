package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class Solution {
    public static Node connect(Node root) {
        if(root == null){
            return new Node();
        }
        Node head = new Node();
        head.next = root;
        bfs(root);
        return head.next;
    }
    public  static void   bfs(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() != 0 ){
            int cap = queue.size();
            while (cap != 0){
                Node tmpNode = queue.poll();
                if(!queue.isEmpty()){
                    queue.peek().next = tmpNode;
                }
                System.out.println(tmpNode.val);
                cap --;
                if(tmpNode.right != null){
                    queue.add(tmpNode.right);
                }
                if(tmpNode.left != null){
                    queue.add(tmpNode.left);
                }
            }

            if(!queue.isEmpty()){
                Node lastNode = queue.peek();
                lastNode.next = null;
            }

        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Node connect = connect(root);
        System.out.println(connect);
    }
}