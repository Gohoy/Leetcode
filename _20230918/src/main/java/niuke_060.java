import java.util.ArrayList;

/**
 * @version V1.0
 * @description:
 * @author: gohoy
 * @date: 2024/2/27
 */
public class niuke_060 {
    // 56 58 60 我都用一个方法，这个通过了，58超时 (O.o)
     class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param n int整型
         * @return string字符串ArrayList
         */
        public ArrayList<String> generateParenthesis (int n) {
            // write code here
            // 一个括号直接返回
            // 两个 ()()     (())
            // 三个  ((()))   ()(())  (())()  (()())  ()()()

            // 将一个完整的括号 按顺序  插入到 上一级的所有组合的缝隙中。去重则为当前级别的结果
            ArrayList<String> res = new ArrayList<>();
            if(n == 1){
                res.add("()");
                return  res;
            }
            if(n == 2){
                res.add("()()");
                res.add("(())");
                return res;
            }
            ArrayList<String> resPre = generateParenthesis(n - 1);
            for (String s : resPre) {
                for(int i = 0 ; i < s.length() ;  i++){
                    String s1 = s.substring(0, i) + "()" + s.substring(i);
                    if(!res.contains(s1)){
                        res.add(s1);
                    }
                }
            }
            return res;
        }
    }
}
