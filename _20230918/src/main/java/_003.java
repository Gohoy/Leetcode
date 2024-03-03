public class _003 {
    //转二进制
    public static String toBinary(int a){
        return Integer.toBinaryString(a);
    }
    //判断二进制数有几个1
    public static int oneCount(String str){
        int count = 0;
        for(int i = 0 ; i < str.length() ; i ++){
            if(str.charAt(i) == '1') count++;
        }
        return count;
    }

    public static int[] getOneCount(int n ){
        int[] result = new int[n+1];
        for(int i = 0 ; i <= n ; i ++){
            result[i] = oneCount(toBinary(i));
        }
        return result;
    }
    public static void main(String[] args) {
        int[] oneCount = getOneCount(3);
        for (int i : oneCount) {
            System.out.println(i);
        }
    }
}
