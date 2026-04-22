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

