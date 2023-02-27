//stack insertion at any position program in java with output
import java.util.Stack;

public class StackInsertionAtAnyPositionExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // push some elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Stack before insertion: " + stack);
        
        // insert element 4 at position 1
        int position = 1;
        int value = 4;
        stack.add(position, value);
        
        System.out.println("Stack after insertion: " + stack);
    }
}
