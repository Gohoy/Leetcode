package test;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a , b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        int count = 0;
        for (int i = a; i < b; i++) {
            if(i>=100 &&  isFlower(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    static boolean isFlower(int n){
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum += Math.pow( Integer.parseInt(String.valueOf(chars[i])),chars.length);
        }
        return sum == n;
    }
}
