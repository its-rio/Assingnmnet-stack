//stack insertion at end program in java with output
import java.util.Stack;

public class StackInsertionAtEndExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // push some elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Stack before insertion: " + stack);
        
        // insert element 4 at the end of the stack
        stack.push(4);
        
        System.out.println("Stack after insertion: " + stack);
    }
}
