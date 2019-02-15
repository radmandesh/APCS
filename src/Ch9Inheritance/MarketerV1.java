package Ch9Inheritance;

public class MarketerV1 extends EmployeeV1 {
    public MarketerV1(String name){
        super(name);
    }
    public double getSalary(){
        return 50000.0;
    }
    public void advertise(){
        System.out.println("buy now");
    }
}
