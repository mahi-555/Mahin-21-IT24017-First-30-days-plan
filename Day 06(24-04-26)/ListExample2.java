import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
      
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Numbers: " + numbers);

        int firstNumber = numbers.get(0);
        System.out.println("First number: " + firstNumber);

        numbers.remove(2); 
        System.out.println("After removal: " + numbers);

        numbers.set(1, 99); 
        System.out.println("After update: " + numbers);

        System.out.println("All numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
