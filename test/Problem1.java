package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem1 {
    public static void main(String[] args) {
        int n;
        String head;
        Scanner scanner = new Scanner(System.in);
//        head = scanner.nextInt();
        head = scanner.next();
        n = scanner.nextInt();
        ArrayList<node> nodes = new ArrayList<>();
        ArrayList<node> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            node node = new node();
//            node.address = String.valueOf(scanner.nextInt());
            node.address = scanner.next();
            node.data = scanner.nextInt();

//            node.next = String.valueOf(scanner.nextInt());
            node.next = scanner.next();
            nodes.add(node);

        }

        for (int j = 0; j < n; j++) {

            for (int i = 0; i < n; i++) {
                if (nodes.get(i).address.equals(head)) {
                    res.add(nodes.get(i));
                    head = nodes.get(i).next;
                }
            }
        }
        Set<Integer> data = new HashSet<>();
        node newNode = new node();
        newNode.data = -1;
        for (int i = 0; i < n; i++) {
            if (!data.contains(Math.abs(res.get(i).data))) {
                data.add(Math.abs(res.get(i).data));
            } else {
                res.get(i - 1).next = res.get(i).next;

                res.set(i, newNode);
            }
        }
        while (res.contains(newNode)) {
            res.remove(newNode);
        }
        System.out.println(res.size() + " ");
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i).address + "  " + res.get(i).data + "  " + res.get(i).next);
        }
    }

    static class node {
        String address;
        int data;
        String next;
    }
}
