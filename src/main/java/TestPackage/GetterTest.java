package TestPackage;

import GetterSetter.Car;

public class GetterTest {

    public static void main(String[] args) {
        Car car = new Car("Red",
                "MDA", 3,
                4000);
        System.out.println(car);
        System.out.printf("%s %s", car.getColor(),car.getModel());
    }
}
