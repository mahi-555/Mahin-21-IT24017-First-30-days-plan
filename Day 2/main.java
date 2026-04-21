public class Main {
  `  public static void main ( string[] args){
    person person = new person("Alic",30);
    system.out.println("Name: "+ person.getName());
    system.out.println("Age: " + person.getAge());
    person.setName("Bob");
    person.setAge(25);
    system.out.println("Update Name: "+ person.getName());
    system.out.println("Update Age: " + person.getAge());
    person.setAge(-5);
  }
}
