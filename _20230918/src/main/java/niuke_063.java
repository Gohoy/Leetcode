public class niuke_063 {
    public static int jumpFloor (int number) {
        // write code here
       if(number == 1) return 1;
       if(number == 2) return 2;
       int s1 = 1;
       int s2 = 2;
       for(int i = 2 ; i < number ; i ++){
           s2 = s1+s2;
           s1 = s2-s1;
       }
       return s2;
    }

    public static void main(String[] args) {
        System.out.println(jumpFloor(29));
    }
}
