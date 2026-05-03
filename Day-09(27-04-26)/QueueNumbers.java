import java.util.LinkedList;
import java.util.Queue;

public class QueueNumbers {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

        numbers.offer(10);
        numbers.offer(20);
        numbers.offer(30);

        System.out.println("Queue: " + numbers);

        System.out.println("Front element: " + numbers.peek());

        numbers.poll();

        System.out.println("Queue after removing: " + numbers);
    }
}
