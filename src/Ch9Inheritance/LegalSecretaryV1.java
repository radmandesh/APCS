package Ch9Inheritance;

public class LegalSecretaryV1 extends SecretaryV1 {
    public LegalSecretaryV1(String name){
        super(name);
    }
    public double getSalary(){
        return 45000.0;
    }
}
