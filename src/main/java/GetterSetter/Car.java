package GetterSetter;

public class Car {

    private String color; //Need Public Access
    private String model; //Need Public Access
    private double fuelLevel;
    private long costOfPurchase; //Default

    public String getColor()
    {
        return color;
    }

    public String getModel()
    {
        return model;
    }

    public void setColor(String color)

    {
        this.color = color;

    }

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';
    }
}


