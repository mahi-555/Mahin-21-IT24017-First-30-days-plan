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
