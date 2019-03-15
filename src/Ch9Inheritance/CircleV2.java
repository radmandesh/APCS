package Ch9Inheritance;

public class CircleV2 extends ShapeV2 {
    private double radius;
    public CircleV2(double radius){
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

    public String toString(){
        return("circle");
    }
}
