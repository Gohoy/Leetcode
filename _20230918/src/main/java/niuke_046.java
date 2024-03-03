import java.util.ArrayList;

public class niuke_046 {
    public ArrayList<Integer> GetLeastNumbers_Solution (int[] input, int k) {
        // write code here
        if(k == 0 || k > input.length) return new ArrayList<>();
        int max = 0 ;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0 ; i < k ; i ++){
            arrayList.add(input[i]);
            max = input[i] > input[max] ? i :max ;
        }
        for( int i = k ; i < input.length ; i ++){
            if(input[i] < arrayList.get(max) ){
                arrayList.set(max , input[i]);
                for(int j = 0 ; j < arrayList.size() ; j ++){
                    max = arrayList.get(max) > arrayList.get(j) ? max : j;
                }
            }
        }
        return arrayList;
    }
}
