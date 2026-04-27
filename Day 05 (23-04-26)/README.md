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


# Example 02
``` java
class Book {
  private String title;
  private String author;
  public Book( String title, String author) {
    this.title = title;
    this.author = author;
  }
  public void displayBookInfo(){
    System.ot.println("Library: "+ libraryName);
    System.out.println("Book Title:"+ title);
    System.out.println("Author:"+ author);
  }
}
}
public class main { 
  public static void main(string[] args){
    Library myLibrary = myLibrary.new Book ("1984","Georage Orwell");
    myBook.displayBookInfo();
  }
}
```
  
