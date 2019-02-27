package Ch9Inheritance;

public class SecretaryV1 extends EmployeeV1 {
    public SecretaryV1(String name, int experience){
        super(name, experience);
    }
    public SecretaryV1(String name){
        super(name);
        this.experience = 0;
    }
    public void getDictation(){
        System.out.println("dictation");
    }
}
