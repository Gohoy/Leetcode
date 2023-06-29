package test;


import java.util.Scanner;

public class Problem4 {
    static int[] isVisited = new int[10000];
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int [][] edges = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            for (int i1 = 0; i1 < n; i1++) {
                edges[i][i1] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            if(isVisited[i] != 1){
                count++;
                dfs(i,edges);
            }
        }
        System.out.println();
        System.out.println(count);
    }
    static int count = 0;
   static void dfs(int i,int[][] edges){
       int[] edge = edges[i];
       System.out.print(i+1+" ");
       isVisited[i] = 1;
       for (int i1 = 0; i1 < edge.length; i1++) {
           if(edge[i1] == 1){
                if(isVisited[i1] == 1){
                    continue;
                }
                dfs(i1,edges);
           }
       }
    }


}
