# Example 01:
```java
class Dog{
String name;
Dog(String dogName) {
name = dogName;
}
void display(){
systrm.out.println("Dog's name:"+ name);
}
}
public class Main{
public static void main ( String [] args){
Dog myDog= new Dog("Buddy");
myDog.display();
}
```
# Example 02:
```java
class Car {
    String brand;
    Car(String carBrand) {
        brand = carBrand;
    }

    void showBrand() {
        System.out.println("Car brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.showBrand();
    }
}
```
