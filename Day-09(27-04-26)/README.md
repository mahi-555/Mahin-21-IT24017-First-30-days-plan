## Example 01 
``` java
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
```

## Example 02
``` java
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

```

