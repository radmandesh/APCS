import java.util.Scanner;

public class ObjectTest {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Name?");
        String name = scan.next();
        Attacker atk = new Attacker(name);
        Defender dfnd = new Defender(name);
    }
}
