package Ch8Classes;

public class PointV4 {
    //state fields for Point class
    private int x;
    private int y;
    private static int objCount; //static fields belong to the class. not an object.
    //behaviors for point class
    public PointV4(int x, int y){
        objCount++;
        this.x = x;
        this.y = y;
    }

    public static void setObjCount(int objCount) {
        PointV4.objCount = objCount;
    }

    public PointV4(){
        objCount++;
        this.x = 0;
        this.y = 0;
    }

    public void translate(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(PointV4 point2){
        return Math.sqrt(Math.pow((point2.x - this.x), 2) + Math.pow((point2.y - this.y), 2));
    }

    public double distanceFromOrigin(){
        return Math.sqrt(Math.pow((this.x), 2) + Math.pow((this.y), 2));
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int getObjCount() {
        return objCount;
    }
}
