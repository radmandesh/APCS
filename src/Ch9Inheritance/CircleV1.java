package Ch9Inheritance;

public class CircleV1 implements ShapeV1 {
    private double radius;
    public CircleV1(double radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
