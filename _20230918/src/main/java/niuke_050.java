import java.util.HashMap;

/**
 * @version V1.0
 * @description:
 * @author: gohoy
 * @date: 2023/12/24
 */
public class niuke_050 {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param numbers int整型一维数组
         * @param target int整型
         * @return int整型一维数组
         */
        // 双层遍历  太慢了，直接超时
//        public int[] twoSum (int[] numbers, int target) {
//            // write code here
//            int[] res = new int[2];
//            for(int i = 0 ; i < numbers.length ; i ++){
//                for(int j = i; j < numbers.length ; j ++){
//                    if(numbers[i] + numbers[j] == target ){
//                      res[0] = i+1;
//                      res[1] = j+1;
//                    }
//                }
//            }
//            return res;
//        }
        // hash表，进行
        public static int[] twoSum (int[] numbers, int target) {
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            int[] res = new  int[2];
            for(int i = 0 ; i < numbers.length ; i ++){
                if(!hashMap.containsKey(target-numbers[i])){
                    hashMap.put(numbers[i],i);
                }else {
                    res[0] = hashMap.get(target-numbers[i])+1;
                    res[1] = i+1;
                    return res;
                }
            }
            return  res;

        }
    public static void main(String[] args) {
        int[] numbers=new int[]{3,2,4};
        int[] ints = twoSum(numbers, 6);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
