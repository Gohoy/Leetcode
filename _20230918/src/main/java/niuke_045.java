import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class niuke_045 {
  public static ArrayList<Integer> maxInWindows(int[] nums , int size){
      if(size == 0 || size > nums.length) return new ArrayList<>();
      ArrayList<Integer>  res = new ArrayList<>();
      Queue<Integer> queue = new LinkedList<>();
      for (int i = 0 ; i < size ; i ++ ) {
          queue.offer(nums[i]);
      }
      int max = 0;
      boolean flag = true;
      for(int i = size ; i <= nums.length ; i ++){
          if(flag){
              max = maxQueueInt(queue);
          }else {
              max = Math.max(max,nums[i-1]);
          }
          if( i < nums.length){
              Integer poll = queue.poll();
              flag = (poll == max);
              queue.offer(nums[i]);
          }
          res.add(max);
      }
      return res;
  }
  public static int maxQueueInt(Queue<Integer> queue){
      Queue<Integer> queue1 = new LinkedList<>();
      int max = Integer.MIN_VALUE;
      while (!queue.isEmpty()){
          Integer poll = queue.poll();
          if(poll > max) {
              max = poll;
          }
          queue1.offer(poll);
      }
      while (!queue1.isEmpty()){
          queue.offer(queue1.poll());
      }
      return max;
  }

    public static void main(String[] args) {
        int[] nums = {2,3,4,2,6,2,5,1};
        ArrayList<Integer> arrayList = maxInWindows(nums, 3);
        arrayList.forEach(System.out::println);
    }
}
