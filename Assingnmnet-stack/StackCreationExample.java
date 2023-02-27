//stack creation program in java with output
import java.util.Stack;

public class StackCreationExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // push some elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        // print out the contents of the stack
        System.out.println("Stack contents: " + stack);
    }
}
