package ss5_access_modifier.stactic_property;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
