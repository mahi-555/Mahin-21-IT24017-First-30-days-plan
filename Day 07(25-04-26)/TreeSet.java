  
import java.util.TreeSet;

public class TreeSetExample {
  public static void main(String[] args) {

    TreeSet<Integer> numbers = new TreeSet<>();

    numbers.add(5);
    numbers.add(3);
    numbers.add(8);
    numbers.add(1);
    numbers.add(3); 

    System.out.println("Numbers in TreeSet: " + numbers);

    if(numbers.contains(5)) {
      System.out.println("5 is present in the set.");
    }

    numbers.remove(8);
    System.out.println("After removal: " + numbers);
  }
}
