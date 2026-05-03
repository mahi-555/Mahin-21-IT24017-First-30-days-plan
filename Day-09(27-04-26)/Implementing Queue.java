import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
public static void main(String[] args) {
Queue<String> queue = new LinkedList<>();
queue.offer("Apple");
queue.offer("Banana");
queue.offer("Cherry");
System.out.println("Queue: '+ queue);
String removeItem = queue.poll();
System.out.println("Removed Item: " + removedItem);
System.out.println("Queue after dequeue : " + queue);
}
}
