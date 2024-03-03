import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class niuke_048 {
    // 简单粗暴能ac
//    ArrayList<Integer> arrayList = new ArrayList<>();
//    public void Insert(Integer num) {
//        arrayList.add(num);
//    }
//
//    public Double GetMedian() {
//        if(arrayList.size() == 1) return Double.valueOf(arrayList.get(0));
//        Collections.sort(arrayList);
//        if(arrayList.size()%2 == 0){
//            return (arrayList.get(arrayList.size()/2-1)+arrayList.get(arrayList.size()/2))/2.0;
//        }
//       return Double.valueOf(arrayList.get(arrayList.size() / 2 ));
//    }
 //堆

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(34);
        priorityQueue.add(6);
        priorityQueue.add(112);
        priorityQueue.add(35);
        System.out.println(priorityQueue.poll());
    }
}
