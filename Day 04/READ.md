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

</pre>
