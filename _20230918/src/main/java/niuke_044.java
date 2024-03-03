import java.util.Stack;

public class niuke_044 {
    // 很慢，但是很简单。 2000ms
//    public boolean isValid (String s) {
//        // write code here
//        int count = 0 ;
//        while (true){
//            if( s.equals(s.replace("{}","").replace("[]","").replace("()",""))){
//                return false;
//            }
//            s = s.replace("{}","").replace("[]","").replace("()","");
//            if(s.equals("")) return  true;
//        }
//    }
    // 使用栈 28ms
    public boolean isValid (String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if(c =='('){
                stack.push(')');
            }else if(c == '{'){
                stack.push('}');
            }else if(c == '['){
                stack.push(']');
            }else if(stack.isEmpty() || c != stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
