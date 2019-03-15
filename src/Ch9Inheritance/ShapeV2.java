package Ch9Inheritance;

public abstract class ShapeV2 implements Comparable {
    abstract double area();
    abstract double perimeter();
    public int compareTo(Object other){
        
        if(this.area() > ((ShapeV2)other).area())
            return 1;
        else if(this.area() < ((ShapeV2)other).area())
            return -1;
        return 0;
    }
}
