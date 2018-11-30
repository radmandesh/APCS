package Ch8Classes;

public class PointV2 {
    //state fields for Point class
    public int x;
    public int y;
    //behaviors for point class
    public PointV2(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void translate(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(PointV2 point2){
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
}
