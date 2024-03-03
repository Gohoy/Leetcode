// 整数除法，不用* 和 / 和 %
public class _001 {

    public static void main(String[] args) {
        int a = -2147483648;
        int b = 1;
        System.out.println(divide(a,b));
    }
    public static int divide(int dividend, int divisor) {

        if(dividend == Integer.MAX_VALUE && divisor == -1){
            return Integer.MIN_VALUE+1;
        }
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        if(dividend == Integer.MIN_VALUE && divisor == 1){
            return Integer.MIN_VALUE;
        }
        if(dividend == Integer.MAX_VALUE && divisor == 1){
            return Integer.MAX_VALUE;
        }

        if(dividend == 0) return 0;
        int result = 0;
        boolean nav = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);
        long dividend1 = Math.abs((long) dividend);
        long divisor1 = Math.abs((long) divisor);
        while(dividend1 >= divisor1){
            dividend1 = dividend1 - divisor1;
            result++;
        }
        if(nav){
            result = -result;
        }
        return result;
    }
}

