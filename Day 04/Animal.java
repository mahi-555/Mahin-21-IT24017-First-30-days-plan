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
