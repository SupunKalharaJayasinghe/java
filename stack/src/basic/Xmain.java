package basic;

/**
 * Xmain class demonstrates the usage of the StackX class.
 * It shows how to push elements onto the stack, peek at the top element,
 * pop elements from the stack, and check for empty conditions.
 */
public class Xmain {

    public static void main(String[] args) {

        // Create a stack with capacity of 10 elements
        StackX stack = new StackX(10);
        
        // Push some elements onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        
        // Loop through the stack until it becomes empty
        while (!stack.isEmpty()) {
            // Display the current top element without removing it
            System.out.println("Your current top value is: " + stack.peek(0));
            
            // Pop the top element from the stack and display it
            System.out.println("Popped value: " + stack.pop(0));
        }
        
        // Try peeking at the top element when the stack is empty
        System.out.println("Your current top value is: " + stack.peek(0));
    }
}
