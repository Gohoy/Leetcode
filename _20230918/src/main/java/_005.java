import java.util.HashMap;

public class _005 {
    public static int maxProduct(String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0 ; i < words.length ; i++ ) {
            String word = words[i];
            for (int j = i+1 ; j < words.length ; j ++  ) {
                if (hasSameChar(word, words[j])) {
                    if (!map.containsKey(word)) {
                        map.put(word, word.length() * words[j].length());
                    } else {
                        map.put(word, Math.max(word.length() * words[j].length(), map.get(word)));
                    }
                }
            }
        }
        int max = 0 ;
        for (Integer value : map.values()) {
            if(value >= max){
                max = value;
            }
        }
        return max;
    }

    public static boolean hasSameChar(String str1, String str2){
        for (char c : str1.toCharArray()) {
            if(str2.contains(String.valueOf(c))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "efgh";
        String str3 = "abcqq";
        String[] strings = new String[3];
        strings[0] = str1;
        strings[1] = str2;
        strings[2] = str3;
        int i = maxProduct(strings);
        System.out.println(i);
    }
}
