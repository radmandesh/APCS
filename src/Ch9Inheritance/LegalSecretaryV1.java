package Ch9Inheritance;

public class LegalSecretaryV1 extends SecretaryV1 {
    public LegalSecretaryV1(String name, int experience){
        super(name, experience);
    }
    public LegalSecretaryV1(String name){
        super(name);
        this.experience = 0;
    }
    public double getSalary(){
        return 45000.0;
    }
}
