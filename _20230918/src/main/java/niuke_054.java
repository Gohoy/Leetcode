import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @version V1.0
 * @description:
 * @author: gohoy
 * @date: 2023/12/27
 */
public class niuke_054 {
    public static ArrayList<ArrayList<Integer>> threeSum (int[] num) {
        // write code here
        if(num.length < 3){
            return  new ArrayList<>();
        }
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        //得到三个数和为0
        int r = num.length-1;;
        for (int i = 0 ; i < r ; i ++){
            r = num.length-1;
            if(num[i]>0 )return res;
            for( int j = i+1 ;  j < r ; j ++){
                int sum = num[i] + num[j] + num[r];
                if(num[i] + num[j] <= 0 && sum > 0){
                    j--;
                    r--;
                    continue;
                }
                if(sum == 0){
                    ArrayList<Integer>  arrayList = new ArrayList<>();
                    arrayList.add(num[i]);
                    arrayList.add(num[j]);
                    arrayList.add(num[r]);
                    if(!res.contains(arrayList)) {
                        res.add(arrayList);
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        ArrayList<ArrayList<Integer>> arrayLists = threeSum(num);
        for (ArrayList<Integer> arrayList : arrayLists) {
            for (Integer integer : arrayList) {
                System.out.println(integer);
            }
        }
    }
}
