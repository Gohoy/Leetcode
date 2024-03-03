import java.util.ArrayList;
import java.util.Arrays;

/**
 * @version V1.0
 * @description: 没有重复项数字的全排列
 * @author: gohoy
 * @date: 2024/1/22
 */
public class niuke_055 {
     class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param num int整型一维数组
         * @return int整型ArrayList<ArrayList<>>
         */
        private void swap(ArrayList<Integer> num, int i1, int i2){
            int temp = num.get(i1);
            num.set(i1, num.get(i2));
            num.set(i2, temp);
        }

        public void recursion(ArrayList<ArrayList<Integer>> res , int index ,ArrayList<Integer> num){
            if(index == num.size()-1){
                res.add(new ArrayList<>(num));
            }else {
                for(int i = index; i <num.size(); i ++){
                    swap(num,index,i );
                    recursion(res, index+1 , num);
                    swap(num,index ,i);
                }
            }
        }
        public  ArrayList<ArrayList<Integer>> permute (int[] num) {
            Arrays.sort(num);
            // write code here
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            ArrayList<Integer> nums = new ArrayList<>();
            for(int i = 0 ;i < num.length ; i++){
                nums.add(num[i]);
            }
            recursion(res, 0 , nums);
            return res;
        }
    }
}
