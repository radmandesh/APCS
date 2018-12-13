package Ch8Classes;

import java.util.Scanner;

//this program simulates a simple checking account
public class BankAccountV1 {
    private double balance;
    private String name;
    private int acctNum;
    private int ssn;
    private int pin;
    private String address;
    private String dob;

    //overloaded constructors

    public BankAccountV1(String name, int ssn, String address, String dob){
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;
    }
    public BankAccountV1(String name, int ssn, String address, String dob, int pin){
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;
        this.pin = pin;
    }

    public void deposit(double amt){
        this.balance += amt;
        System.out.println("Deposited $" + amt);
    }

    public void withdraw(double amt){
        this.balance -= amt;
        System.out.println("Withdrew $" + amt);
    }

    public void changePin(){
        System.out.println("Old pin?");
        Scanner scan = new Scanner(System.in);
        int oldPin = scan.nextInt();
        while(oldPin != this.pin && oldPin != -1){
            System.out.println("That pin is incorrect. Try again or type -1 to cancel.");
            oldPin = scan.nextInt();
            System.out.println(this.pin);
            System.out.println(oldPin);
        }
        System.out.println("Type new pin");
        int newPin = scan.nextInt();
        System.out.println("Type new pin again");
        int newPinConfirm = scan.nextInt();
        while(newPin != newPinConfirm && newPin != -1){
            System.out.println("Those are not the same. Try again or type -1 to cancel.");
            newPin = scan.nextInt();
            System.out.println("Type new pin again");
            newPinConfirm = scan.nextInt();
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public String toString(){
        return "$" + balance;
    }

    public int getPin(){ return this.pin; }

}
