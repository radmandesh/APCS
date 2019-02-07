package Ch9Inheritance;

public class LawyerV1 extends EmployeeV1 {
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
