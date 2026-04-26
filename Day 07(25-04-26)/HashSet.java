import java.util.HashSet;
public class HashSetExample {
  public static void main(String[] args){
    HashSet<String> fruits = new HashSet>();
    fruits.add("Apple);
    fruits.add("Banana);
    fruits.add("Cherry);
    fruits.add("Banana);

  System.out.println("Fruits in the HashSet: " + fruits);
    if(fruits.contains("Apple")) {
      system.out.println("Apple is present in the set.");
    }
    fruits.remove("Cherry");
    System.out.println("After removal: "+ fruits);
  }
}
