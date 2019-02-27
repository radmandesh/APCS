package Ch9Inheritance;

public class LawyerV1 extends EmployeeV1 {
    public LawyerV1(String name, int experience){
        super(name, experience);
    }
    public LawyerV1(String name){
        super(name);
        this.experience = 0;
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
