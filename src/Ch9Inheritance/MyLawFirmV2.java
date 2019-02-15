package Ch9Inheritance;
//instantiates 3 objects of the type employee to print their salaries
public class MyLawFirmV2 {
    public static void main(String[] args){
        EmployeeV1[] myEmployees = {new LawyerV1("Gaby"), new SecretaryV1("Andrew"), new MarketerV1("Charlie")};
        printInfo(myEmployees);
    }
    public static void printInfo(EmployeeV1[] emp){
        for(int i = 0; i < emp.length; i++) {
            System.out.println("name: " + emp[i].getName());
            System.out.println("salary: " + emp[i].getSalary());
            System.out.println("vacation days: " + emp[i].getVacationDays());
        }
    }
}
