package basic;

/**
 * QueueX class represents a circular queue using an array.
 * It supports insertion (enqueue), removal (dequeue), and peek operations.
 */
public class QueueX {

    private double[] queueArray; // Array to hold queue elements
    private int maxSize;         // Maximum capacity of the queue
    private int front;           // Index of the front element
    private int rear;            // Index of the rear element
    private int nItem;           // Number of elements currently in the queue

    /**
     * Constructor to initialize the queue with a given size.
     * @param s Maximum size of the queue
     */
    public QueueX(int s) {
        this.maxSize = s;
        this.queueArray = new double[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItem = 0;
    }

    /**
     * Check if the queue is full.
     * @return true if the queue is full
     */
    public boolean isFull() {
        return nItem == maxSize;
    }

    /**
     * Check if the queue is empty.
     * @return true if the queue is empty
     */
    public boolean isEmpty() {
        return nItem == 0;
    }

    /**
     * Insert (enqueue) an element at the rear of the circular queue.
     * @param j The value to insert
     */
    public void insert(double j) {
        if (isFull()) {
            System.out.println("The queue is full");
            return;
        }

        // Wrap around if rear reaches end
        if (rear == maxSize - 1) {
            rear = -1;
        }

        // Move rear forward and insert
        rear++;
        queueArray[rear] = j;
        nItem++;
    }

    /**
     * Remove (dequeue) an element from the front of the queue.
     * @return The value removed from the queue
     */
    public double remove() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return -1;
        }

        double temp = queueArray[front++]; // store front value and move pointer
        if (front == maxSize) {            // wrap around if front reaches end
            front = 0;
        }
        nItem--;
        return temp;
    }

    /**
     * Peek at the front element without removing it.
     * @return The value at the front of the queue
     */
    public double peekFront() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return -1;
        }
        return queueArray[front];
    }
}
