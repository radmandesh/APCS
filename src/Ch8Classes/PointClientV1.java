package Ch8Classes;

public class PointClientV1 {
    public static void main(String[] args){
        PointV1 point = new PointV1();
        System.out.println(point.x + " " + point.y);
        point.x = 1;
        point.y = 6;
        System.out.println(point.x + " " + point.y);
    }
}
