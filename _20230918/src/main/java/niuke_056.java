import java.util.ArrayList;
import java.util.Arrays;

/**
 * @version V1.0
 * @description: 牛客必刷101第56
 * @author: gohoy
 * @date: 2024/2/26
 */
// 数字的全排列
public class niuke_056 {
    public static ArrayList<ArrayList<Integer>> permuteUnique (int[] num) {
        // write code here
        // 将num 中的元素进行全排列，假设有 1 ， 2 ，3
        // 1  之后 有 2， 3
        // 1，2  之后 只有 3，
        // 3 的全排列 只有3 一种
        // 2， 3 的全排列有 两种
        // 1 ，2 ，3 的全排列有 1， 2，3   1 ，3 ，2   2， 1， 3 2， 3， 1 3，1，2 3，2，1
        // 1 ， 2， 3 ，4 有


        // 3 个数字， 把三个数字全部都 分别拿出来， 剩下两个数字 进行全排列， 并且每个结果和 头元素进行拼接
        // 4 个数字， 把四个数字全部分别拿出来， 剩下三个进行三个的全排列， 每个结果和头元素拼接。
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(num);
        for (int i : num) {
            arrayList.add(i);
        }
        return help(arrayList);

    }

    public static ArrayList<ArrayList<Integer>>  help(ArrayList<Integer> num ){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int length = num.size();
        if(length == 1){
            ArrayList<Integer> order = new ArrayList<>();
            order.add(num.get(0));
            res.add(order);
            return  res;
        }
        if(length == 2){
            ArrayList<Integer> order = new ArrayList<>();
            order.add(num.get(0));
            order.add(num.get(1));
            res.add(order);
            order = new ArrayList<>();
            order.add(num.get(1));
            order.add(num.get(0));
            res.add(order);
            return res;
        }
        // length 大于3 ， 就开始分， 取第一个，然后把剩下的值 传入这个方法，得到的结果和 第一个进行拼接，得到的就是这个长度的结果
        for(int i = 0 ; i < num.size() ; i ++){
            int index = num.get(i);
            // 除了index之外的数字进行排列，然后和index 整合作为结果
            ArrayList<Integer> numCopy = new ArrayList<>(num);
            numCopy.remove(i);
            ArrayList<ArrayList<Integer>> help = help(numCopy);
            for (ArrayList<Integer> arrayList : help) {
                arrayList.add(0,index);
                if(!res.contains(arrayList)) {
                    res.add(arrayList);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayLists = permuteUnique(new int[]{0, 1, 2});
        arrayLists.forEach(System.out::println);

    }
}
