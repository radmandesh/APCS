package Ch9Inheritance;

public class ShapeClientV1 {
    public static void main(String[] args){
        ShapeV1[] list = {new CircleV1(2), new RectangleV1(2, 4), new TriangleV1(3, 4, 5)};
        print(list);
    }
    public static void print(ShapeV1[] list){
        for(int i = 0; i < list.length; i++){
            System.out.println("shape: " + list[i] + ". area: " + list[i].area() + ". perimeter: " + list[i].perimeter() + ".");
        }
        for(ShapeV1 shape : list){
            System.out.println("shape: " + shape + ". area: " + shape.area() + ". perimeter: " + shape.perimeter() + ".");
        }
    }
}
