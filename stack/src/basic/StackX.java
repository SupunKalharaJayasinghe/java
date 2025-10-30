package basic;

/**
 * StackX class represents a simple stack data structure
 * implemented using an array. It supports basic stack operations
 * like push, pop, and peek, and checks for empty/full conditions.
 */
public class StackX {
    
    private double[] stackArray; // array to store stack elements
    private int maxSize;         // maximum capacity of the stack
    private int top;             // index of the top element in the stack
    
    /**
     * Constructor to initialize the stack with a given size.
     * @param s the maximum size of the stack
     */
    public StackX(int s) {
        this.maxSize = s;
        this.stackArray = new double[maxSize];
        this.top = -1; // stack is initially empty
    }
    
    /**
     * Check if the stack is empty.
     * @return true if stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return top == -1;
    }
    
    /**
     * Check if the stack is full.
     * @return true if stack is full, false otherwise
     */
    public boolean isFull() {
        return top == maxSize - 1;
    }
    
    /**
     * Push a new element onto the top of the stack.
     * If the stack is full, a message is printed and operation is aborted.
     * @param j the value to push onto the stack
     */
    public void push(double j) {
        if (isFull()) {
            System.out.println("The stack is full");
            return; // exit without adding
        }
        top++;              // move top pointer up
        stackArray[top] = j; // store the new value
    }
    
    /**
     * Pop the top element from the stack.
     * If the stack is empty, a message is printed and -1 is returned.
     * @param j (unused parameter, not needed for pop)
     * @return the top value of the stack, or -1 if empty
     */
    public double pop(double j) {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        }
        return stackArray[top--]; // return top element and move pointer down
    }
    
    /**
     * Peek at the top element of the stack without removing it.
     * If the stack is empty, a message is printed and -1 is returned.
     * @param j (unused parameter, not needed for peek)
     * @return the top value of the stack, or -1 if empty
     */
    public double peek(double j) {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        }
        return stackArray[top]; // return top element without removing
    }
}
