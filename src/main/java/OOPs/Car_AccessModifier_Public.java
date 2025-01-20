package OOPs;

public class Car_AccessModifier_Public {
    public String color;
    public String model;
    private double fuelLevel;
    private long costOfPurchase;

    public Car_AccessModifier_Public()
    {

    }

    public Car_AccessModifier_Public(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "Car_AccessModifier_Public{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';
    }
}
