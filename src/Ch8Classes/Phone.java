package Ch8Classes;

import java.util.Scanner;

public class Phone {
    private String owner;
    private String maker;
    private String model;
    private String color;
    private int password;
    private boolean hasCellService;
    private int price;

    public Phone(String owner, String maker, String model, String color, int password, boolean hasCellService, int price) {
        this.model = model;
        this.color = color;
        this.password = password;
        this.hasCellService = hasCellService;
        this.price = price;
        this.owner = owner;
        this.maker = maker;
    }

    public String getOwner() {
        return owner;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasCellService() {
        return hasCellService;
    }

    public int getPrice() {
        return price;
    }

    public void setPassword(){
        System.out.println("Old password?");
        Scanner scan = new Scanner(System.in);
        int oldPass = scan.nextInt();
        while(oldPass != this.password && oldPass != -1){
            System.out.println("That password is incorrect. Try again or type -1 to cancel.");
            oldPass = scan.nextInt();
            System.out.println(this.password);
            System.out.println(oldPass);
        }
        System.out.println("Type new password");
        int newPass = scan.nextInt();
        System.out.println("Type new password again");
        int newPinConfirm = scan.nextInt();
        while(newPass != newPinConfirm && newPass != -1){
            System.out.println("Those are not the same. Try again or type -1 to cancel.");
            newPass = scan.nextInt();
            System.out.println("Type new password again");
            newPinConfirm = scan.nextInt();
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "owner='" + owner + '\'' +
                ", maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", hasCellService=" + hasCellService +
                ", price=" + price +
                '}';
    }
}
