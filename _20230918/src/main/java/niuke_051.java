import java.util.HashMap;

/**
 * @version V1.0
 * @description:
 * @author: gohoy
 * @date: 2023/12/24
 */
public class niuke_051 {
    public int MoreThanHalfNum_Solution (int[] numbers) {
        // write code here
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0 ; i <numbers.length ; i++){
            if(!hashMap.containsKey(numbers[i])){
                hashMap.put(numbers[i],1);
            }else {
                hashMap.put(numbers[i],hashMap.get(numbers[i])+1);
            }
        }
        for (Integer integer : hashMap.keySet()) {
            if(hashMap.get(integer) > numbers.length/2){
                return integer;
            }
        }
        return 1;
    }
}
