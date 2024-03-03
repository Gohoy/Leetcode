import java.util.Stack;

public class niuke_043 {

    public static Stack<Integer> stack1 = new Stack<Integer>();
    public  static Stack<Integer> stack2 = new Stack<Integer>();
    public static void push(int node) {
        while (!stack2.isEmpty()) {
            Integer pop = stack2.pop();
            stack1.push(pop);
        }
        stack1.push(node);
    }

    public static int pop() {
        while (!stack2.isEmpty()) {
            Integer pop = stack2.pop();
            stack1.push(pop);
        }
        return stack1.pop();
    }

    public static int top() {
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return stack1.peek();
    }

    public static int min() {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int min = Integer.MAX_VALUE;
        while (!stack2.isEmpty()){
            Integer pop = stack2.pop();
            if(pop < min) min = pop;
            stack1.push(pop);
        }
        return min;
    }

    public static void main(String[] args) {
       push(-1);
        push(2);
        System.out.println(min());
        System.out.println(top());
        System.out.println(pop());
        push(1);
        System.out.println( top());
        System.out.println(min());
    }
}
