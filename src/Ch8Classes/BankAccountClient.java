package Ch8Classes;

public class BankAccountClient {
    public static void main(String[] args){
        BankAccountV2 rohan = new BankAccountV2("Rohan Deshpande", 123456789, new Address(6, "Acorn Ln", "Larchmont", "NY", 10538), new DateOfBirth(12, 18, 2000), 1234);
        rohan.deposit(500);
        System.out.println(rohan);
        rohan.withdraw(253);
        System.out.println(rohan + " " + rohan.getDob() + " " + rohan.getAddress());
        System.out.println(rohan.getPin());
        rohan.changePin();

    }
}
