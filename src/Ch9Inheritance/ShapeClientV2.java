package Ch9Inheritance;

public class ShapeClientV2 {
    public static void main(String[] args){
        ShapeV2[] list = {new CircleV2(2), new RectangleV2(2, 4), new TriangleV2(3, 4, 5)};
        print(list);
        int compareArea = list[1].compareTo(list[2]);
        System.out.println(compareArea);
    }
    public static void print(ShapeV2[] list){
        for(int i = 0; i < list.length; i++){
            System.out.println("shape: " + list[i] + ". area: " + list[i].area() + ". perimeter: " + list[i].perimeter() + ".");
        }
        for(ShapeV2 shape : list){
            System.out.println("shape: " + shape + ". area: " + shape.area() + ". perimeter: " + shape.perimeter() + ".");
        }
    }
}
