package Ch8Classes;

public class PointClientV4 {
    public static void main(String[] args){
        PointV4 point = new PointV4(0,0);
        PointV4 point2 = new PointV4();
        System.out.println(point.getX() + " " + point.getY());
        System.out.println(point2.getX() + " " + point2.getY());
        point.translate(2,2);
        point2.translate(3,-4);
        System.out.println(point.getX() + " " + point.getY());
        System.out.println(point2.getX() + " " + point2.getY());
        point.setLocation(4,2);
        point2.setLocation(8,27);
        System.out.println(point.getX() + " " + point.getY());
        System.out.println(point2.getX() + " " + point2.getY());
        System.out.println(point.distance(point2));
        System.out.println(point.distanceFromOrigin());
        System.out.println(point);
    }
}
