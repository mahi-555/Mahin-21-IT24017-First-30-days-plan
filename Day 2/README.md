Example 01

<pre>
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



 class person {
  private string name;
  private int age;
  public person(string name, int age) {
    this.name = name;
    this.age = age;
    public string getName() {
      return name;
    }
    public void setName(string name) {
      this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age){
    if(age>=0) {
      this.age = age;
    } else{
      system.out.println("Age cannot be negative.");
    }
  }
}
</pre>
