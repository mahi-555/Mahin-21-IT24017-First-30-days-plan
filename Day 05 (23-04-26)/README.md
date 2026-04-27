# Example 01
```java
abstract class Shape {
  abstract void draw();
  void display() {
    System.out.println("This os a shape.");
  }
}
class circle extends shape {
  void draw() {
    System.out.println("Drawing Circle");
  }
}
public class Main{
 public static void main(String [] args){
   Shape shape = new Circle();
   shape.draw();
   shape.display();
 }
}
```
