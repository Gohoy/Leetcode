import java.math.BigDecimal;

public class _002 {
    public static void main(String[] args) {
        String a = "111";
        String b = "101";
        System.out.println(addBinary(a,b));
    }

    public static Result add(char a, char b, char c) {
        // c 为进位
        Result result = new Result();
        if (a == '1' && b == '1') {
            result.setFlag(true);
            result.setResult(c);
        } else if ((a == '1' && b == '0') || (a == '0' && b == '1')) {

            if (c == '1') {
                result.setFlag(true);
                result.setResult('0');
            } else {
                result.setFlag(false);
                result.setResult('1');
            }
        } else {
            result.setResult(c);
            result.setFlag(false);
        }
        return result;
    }

    public static String addBinary(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        int length1 = str1.length();
        int length2 = str2.length();
        if (length1 < length2) {
            for (int i = length1; i < length2; i++) {
                str1 = new StringBuilder(str1).insert(0, '0').toString();
            }
        } else if (length1 > length2) {
            for (int i = length2; i < length1; i++) {
                str2 = new StringBuilder(str2).insert(0, '0').toString();
            }
        }
        char c = '0';
        Result result = new Result();
        for (int i = str1.length() -1; i >= 0; i--) {
           result = add(str1.charAt(i), str2.charAt(i), c);
            stringBuilder.insert(0, result.getResult());
            if (result.isFlag()) {
                c = '1';
            } else {
                c = '0';
            }
        }
        if(result.isFlag()){
            stringBuilder.insert(0,'1');
        }
        return stringBuilder.toString();
    }

    static class Result {
        private boolean flag;
        private char result;

        public boolean isFlag() {
            return flag;
        }

        public void setFlag(boolean flag) {
            this.flag = flag;
        }

        public char getResult() {
            return result;
        }

        public void setResult(char result) {
            this.result = result;
        }
    }
}
