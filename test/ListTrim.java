package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListTrim {
static class node  {
        String data;
        String address;
        String next;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String head ;
        head = scanner.next();
        n = scanner.nextInt();

        ArrayList<node> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            node newNode = new node();
            newNode.address = scanner.next();
            newNode.data = scanner.next();
            newNode.next = scanner.next();
            if(arrayList.size()==0){
                arrayList.add(newNode);
            }else {
                for (int i1 = 0; i1 < arrayList.size(); i1++) {
                    if(arrayList.get(i1).next.equals(newNode.address)){
                        arrayList.add(i1,newNode);
                        break;
                    }
                }
            }
            if(!arrayList.contains(newNode))
                arrayList.add(newNode);
        }
        ArrayList<node> arrayList1 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList1.add(0,arrayList.get(i));
        }
        HashMap<String, String> map = new HashMap<String, String>();
        ArrayList<node> res = new ArrayList<>();
        for (int i = 0; i < arrayList1.size(); i++) {
            if(!map.containsKey(String.valueOf(Math.abs(Integer.parseInt(arrayList1.get(i).data))))){
                map.put(String.valueOf(Math.abs(Integer.parseInt(arrayList1.get(i).data))),"1");
                res.add(arrayList1.get(i));
            }else{
                res.get(res.size()-1).next = arrayList1.get(i).next;
            }
        }
        System.out.println(res.size());
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i).address+"  "+res.get(i).data+"  "+res.get(i).next);

        }
    }


}
