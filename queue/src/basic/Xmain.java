package basic;

public class Xmain {
    public static void main(String[] args) {
    	
        QueueX queue = new QueueX(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        
        System.out.println("Removed: " + queue.remove());
        System.out.println("Removed: " + queue.remove());

        queue.insert(60);
        queue.insert(70);

        while (!queue.isEmpty()) {
            System.out.println("Front: " + queue.peekFront());
            System.out.println("Removed: " + queue.remove());
        }
    }
}
