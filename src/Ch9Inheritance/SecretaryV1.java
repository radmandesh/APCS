package Ch9Inheritance;

public class SecretaryV1 extends EmployeeV1 {
    public SecretaryV1(String name){
        super(name);
    }
    public void getDictation(){
        System.out.println("dictation");
    }
}
