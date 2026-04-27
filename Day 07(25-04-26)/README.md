# Example 01
``` java  
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

```

# Example 02
```java
import java.util.TreeSet;

public class TreeSetStringExample {
  public static void main(String[] args) {

    TreeSet<String> names = new TreeSet<>();

    names.add("Rahim");
    names.add("Karim");
    names.add("Anik");
    names.add("Zara");
    names.add("Karim"); 

    System.out.println("Names: " + names);

    System.out.println("First: " + names.first());
    System.out.println("Last: " + names.last());

    names.remove("Anik");
    System.out.println("After removal: " + names);
    
    for(String name : names) {
      System.out.println(name);
    }
  }
}
```
