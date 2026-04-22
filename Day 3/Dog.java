
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
