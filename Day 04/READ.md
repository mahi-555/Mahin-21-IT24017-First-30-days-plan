***Example 01***
<pre>

//SUPERCLASS
Class Animal {
  String name;
void eat() {
  System.out.println(name + " is eating.");
}
}

//SUBCLASS
Class Dog extends Animal {
  void bark() {
    System.out.println(name + " says woof!");
  }
}


// INHERITANCE

Public class Main {
  public static void main(String[] args) {
    Dog myDog = new Dog();
    myDog.name = "Buddy";
    myDog.eat();
    myDog.bark();
  }
}

***Example 02***


  // SUPERCLASS 
class Vehicle {
    String brand = "Yamaha";
    void move() {
        System.out.println("The vehicle is moving!");
    }
}

// SUBCLASS 
class Bike extends Vehicle {
    void ringBell() {
        System.out.println(brand + " bike says: Ring Ring!");
    }
}

// MAIN CLASS
public class Main {
    public static void main(String[] args) {
        Bike myBike = new Bike();
  
        System.out.println("Brand: " + myBike.brand);
        myBike.move();
        myBike.ringBell();
    }
}
</pre>
