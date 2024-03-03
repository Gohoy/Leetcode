import java.util.HashMap;

/**
 * @version V1.0
 * @description:
 * @author: gohoy
 * @date: 2023/12/24
 */
public class niuke_052 {
    public int[] FindNumsAppearOnce (int[] nums) {
        // write code here
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0 ; i < nums.length; i++ ){
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],1);
            }else{
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }
        }
        for (Integer integer : hashMap.keySet()) {
            if(hashMap.get(integer) == 1){
                if(res[0] == 0){
                    res[0] = integer;
                }else {
                    res[1] = integer;
                    return res;
                }
            }
        }
        return res;
    }
}
