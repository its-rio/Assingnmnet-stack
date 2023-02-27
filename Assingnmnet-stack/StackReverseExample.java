//stack reverse program in java with output
import java.util.Stack;

public class StackReverseExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // push some elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Stack before reverse: " + stack);
        
        // reverse the stack using a temporary stack
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
        stack = tempStack;
        
        System.out.println("Stack after reverse: " + stack);
    }
}
