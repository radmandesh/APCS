package Ch9Inheritance;

public class TriangleV2 extends ShapeV2 {
    private double a;
    private double b;
    private double c;
    private double s;
    public TriangleV2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.s = 0.5 * (a + b + c);
    }
    @Override
    public double area() {
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
    public String toString(){
        return("triangle");
    }
}
