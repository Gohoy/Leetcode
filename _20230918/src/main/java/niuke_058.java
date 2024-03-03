import java.util.ArrayList;

/**
 * @version V1.0
 * @description:
 * @author: gohoy
 * @date: 2024/2/26
 */

// 和 056 题目没什么不同，可能是我的做法没什么不同 , 直接使用56题目的做法 时间超出
//
public class niuke_058 {
    class Solution {

        public ArrayList<String> Permutation(String str) {
            // 取出str第一个字母，其他部分进行
            return help(str);
        }

        public ArrayList<String> help(String str) {

            ArrayList<String> res = new ArrayList<>();
            if (str.length() == 1) {
                res.add(str);
                return res;
            }
            if(str.length() == 2){
                res.add(str);
                String reverse = new StringBuilder(str).reverse().toString();
                if(!res.contains(reverse)){
                    res.add(reverse);
                }
                return res;
            }
            // 长度大于3，截取第一个字符之后的
            for (int i = 0 ; i < str.length();  i ++){
                char index = str.charAt(i);
                ArrayList<String> help = help(str.substring(0,i)+str.substring(i+1));
                for (String s : help) {
                    if(!res.contains(index+s)){
                        res.add(index+s);
                    }
                }
            }
            return res;
        }
    }

}
