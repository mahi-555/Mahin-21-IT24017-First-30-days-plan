import java.util.HashSet;

public class NumberSetExample {
  public static void main(String[] args) {

    HashSet<Integer> numbers = new HashSet<>();
    
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(20); // duplicate

    System.out.println("Numbers: " + numbers);
    
    if(numbers.contains(10)) {
      System.out.println("10 is present.");
    }
    
    numbers.remove(30);
    System.out.println("After removal: " + numbers);

    System.out.println("Size: " + numbers.size());

    for(Integer num : numbers) {
      System.out.println(num);
    }
  }
}
