package offer1;

import java.util.HashMap;

class Solution {
    public int findRepeatNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                return num;
            }
//            可以不加else 一定不加，可以优化很多内存和时间

            hashMap.put(num, num);
        }
        return 0;
    }
}