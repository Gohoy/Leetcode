package medium5;

import java.util.Arrays;

class Solution {
    public static String longestPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        String res = "";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int k = 1;
            if(i+1<chars.length &&chars[i+1]==chars[i]){
                sb = new StringBuilder(String.valueOf(chars));
                sb.insert(i,'1');
                chars = sb.toString().toCharArray();
            }

            sb = new StringBuilder();
            sb.append(chars[i]);
            while (i - k >= 0 && i + k < chars.length && chars[i - k] == chars[i + k]) {
                sb.insert(0, chars[i - k]);
                sb.append(chars[i + k]);
                k++;
            }
            if (res.length() < 2 && sb.length() <2 ) {

                if (i - 1 >= 0 && chars[i - 1] == chars[i]) {
                    sb.insert(0, chars[i - 1]);
                }
                if (i + 1 < chars.length && chars[i + 1] == chars[i]) {
                    sb.append(chars[i + 1]);
                }

            }
            String sbString = sb.toString().replace("1","");
            chars = String.valueOf(chars).replace("1","").toCharArray();
            if (sbString.length() > res.length()) {
                res = sbString;
            }
        }
        for (int i = 0; i < chars.length; i++) {
            int k = 1;

            sb = new StringBuilder();
            sb.append(chars[i]);
            while (i - k >= 0 && i + k < chars.length && chars[i - k] == chars[i + k]) {
                sb.insert(0, chars[i - k]);
                sb.append(chars[i + k]);
                k++;
            }
            if (res.length() < 2 && sb.length() <2 ) {

                if (i - 1 >= 0 && chars[i - 1] == chars[i]) {
                    sb.insert(0, chars[i - 1]);
                }
                if (i + 1 < chars.length && chars[i + 1] == chars[i]) {
                    sb.append(chars[i + 1]);
                }

            }
            String sbString = sb.toString();
//            String sbString = sb.toString().replace("1","");
//            chars = String.valueOf(chars).replace("1","").toCharArray();
            if (sbString.length() > res.length()) {
                res = sbString;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String a = "tattarrattat";
        System.out.println(longestPalindrome(a));
    }
}
