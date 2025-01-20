package OOPs;

public class AccessTest {
    public static void main(String[] args) {

        Car_AccessModifier_Public car = new Car_AccessModifier_Public();
        car.color = "Red";
        car.model = "BMW";
        System.out.println(car);
        Car_AccessModifier_Public newCar = new Car_AccessModifier_Public("Black",
                "BMW",
                1,200);
        System.out.println(newCar);
        Default def = new Default();

    }
}
