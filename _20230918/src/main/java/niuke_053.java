import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * @version V1.0
 * @description:
 * @author: gohoy
 * @date: 2023/12/24
 */
public class niuke_053 {
    public int minNumberDisappeared (int[] nums) {
        // write code here
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        int i = 1;
        while (true){
            if(!hashSet.contains(i)) return i;
            i++;
        }
    }
}
