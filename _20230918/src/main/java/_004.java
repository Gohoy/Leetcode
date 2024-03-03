import java.util.HashMap;

public class _004 {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int num : nums){
            if(map.containsKey(num)){
                map.replace(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        for (Integer integer : map.keySet()) {
            if(map.get(integer) == 1){
                return integer;
            }
        }
        return -1;
    }
}
