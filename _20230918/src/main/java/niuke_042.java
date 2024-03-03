import java.util.Stack;

public class niuke_042 {

   public static  Stack<Integer> stack1 = new Stack<Integer>();
   public  static Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while (!stack2.isEmpty()) {
            Integer pop = stack2.pop();
            stack1.push(pop);
        }
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            Integer pop = stack1.pop();
            stack2.push(pop);
        }
        return stack2.pop();
    }

}
