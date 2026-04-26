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
