package Ch9Inheritance;

public class EmployeeV1 {
    private String name;
    public int experience;
    public EmployeeV1(String name, int experience){
        this.name = name;
        this.experience = experience;
    }
    public EmployeeV1(String name){
        this.name = name;
        this.experience = 0;
    }
    public int getHours(){
        return 40;
    }
    public double getSalary(){
        return 40000.0;
    }
    public int getVacationDays(){
        return 10;
    }
    public String getVacationForm(){
        return "yellow";
    }
    public String getName(){
        return name;
    }
}
