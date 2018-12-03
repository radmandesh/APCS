package Ch8Classes;

public class PointClientV3 {
    public static void main(String[] args){
        PointV3 point = new PointV3(0,0);
        PointV3 point2 = new PointV3();
        System.out.println(point.x + " " + point.y);
        System.out.println(point2.x + " " + point2.y);
        point.translate(2,2);
        point2.translate(3,-4);
        System.out.println(point.x + " " + point.y);
        System.out.println(point2.x + " " + point2.y);
        point.setLocation(4,2);
        point2.setLocation(8,27);
        System.out.println(point.x + " " + point.y);
        System.out.println(point2.x + " " + point2.y);
        System.out.println(point.distance(point2));
        System.out.println(point.distanceFromOrigin());
        System.out.println(point);
    }
}
