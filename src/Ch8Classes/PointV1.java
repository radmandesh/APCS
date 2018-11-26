package Ch8Classes;

public class PointV1 {
    //state fields for Point class
    public int x;
    public int y;
    //behaviors for point class
    public void translate(int x, int y) {
        this.x += x;
        this.y += y;
    }
}
