package Ch9Inheritance;

public class RectangleV2 extends ShapeV2 {
    private double length;
    private double width;
    public RectangleV2(int length, int width){
        this.width = width;
        this.length = length;
    }
    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return (2 * length) + (2 * width);
    }

    public String toString(){
        return("rectangle");
    }
}
