package medium3;

import java.util.HashMap;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();
        int res = 1;
        char[] cs = s.toCharArray();
        for(int i = 0 ; i <  cs.length ; i++){
            if(!hashMap.containsKey(cs[i])){
                hashMap.put(cs[i],i);
            }else {
                if(hashMap.keySet().size()>res){
                    res = hashMap.keySet().size();
                }
                i = hashMap.get(cs[i]);
                hashMap.clear();
            }
        }
        if(hashMap.keySet().size() > res){
            res = hashMap.keySet().size();
        }
        return  res;
    }

    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}