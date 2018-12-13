package Ch8Classes;

public class BankAccountClient {
    public static void main(String[] args){
        BankAccountV1 rohan = new BankAccountV1("Rohan Deshpande", 123456789, "6 Acorn Lane", "12/08/2000", 1234);
        rohan.deposit(500);
        System.out.println(rohan);
        rohan.withdraw(253);
        System.out.println(rohan);
        System.out.println(rohan.getPin());
        rohan.changePin();

    }
}
