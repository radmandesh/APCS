package Ch8Classes;

public class Car {
    public String owner;
    public String maker;
    public String model;
    public String color;
    public int seats;
    public int doors;
    public int price;

    public Car(String owner, String maker, String model, String color, int seats, int doors, int price) {
        this.owner = owner;
        this.maker = maker;
        this.model = model;
        this.color = color;
        this.seats = seats;
        this.doors = doors;
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSeats() {
        return seats;
    }

    public int getDoors() {
        return doors;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "owner='" + owner + '\'' +
                ", maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", seats=" + seats +
                ", doors=" + doors +
                ", price=" + price +
                '}';
    }
}
