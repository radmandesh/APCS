package Ch9Inheritance;

public class LawyerV1 extends EmployeeV1 {
    public LawyerV1(String name){
        super(name);
    }
    public int getVacationDays(){
        return 15;
    }
    public String getVacationForm(){
        return "pink";
    }
    public void sue(){
        System.out.println("get sued idiot");
    }
}
