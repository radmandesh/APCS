package Ch9Inheritance;
//instantiates 3 objects of the type employee to print their salaries
public class MyLawFirmV2 {
    public static void main(String[] args){
        EmployeeV1[] myEmployees = {new LawyerV1("Gaby", 5), new SecretaryV1("Andrew", 5), new MarketerV1("Charlie", 5), new LawyerV1("Rohan")};
        printInfo(myEmployees);
    }
    public static void printInfo(EmployeeV1[] emp){
        /*
        for(int i = 0; i < emp.length; i++) {
            System.out.println("name: " + emp[i].getName());
            System.out.println("salary: " + emp[i].getSalary());
            System.out.println("vacation days: " + emp[i].getVacationDays());
            System.out.println("experience: " + emp[i].experience + " years\n");
        }
        */
        for(EmployeeV1 people : emp){
            System.out.println("name: " + people.getName());
            System.out.println("salary: " + people.getSalary());
            System.out.println("vacation days: " + people.getVacationDays());
            System.out.println("experience: " + people.experience + " years\n");
        }
    }
}
