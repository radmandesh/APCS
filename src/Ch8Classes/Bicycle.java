package Ch8Classes;

public class Bicycle {
    private double price;
    private boolean isPurchased;
    private String condition;
    private int ageRange;
    private String color;

    public Bicycle(double price, boolean isPurchased, String condition, int ageRange, String color) {
        this.price = price;
        this.isPurchased = isPurchased;
        this.condition = condition;
        this.ageRange = ageRange;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    public String getCondition() {
        return condition;
    }

    public int getAgeRange() {
        return ageRange;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "price=" + price +
                ", isPurchased=" + isPurchased +
                ", condition='" + condition + '\'' +
                ", ageRange=" + ageRange +
                ", color='" + color + '\'' +
                '}';
    }
}
