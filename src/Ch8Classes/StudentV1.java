package Ch8Classes;

public class StudentV1 {
    private String name;
    private int grade;
    private String address;
    private String dob;
    private char gender;
    private String[] schedule;
    private String counselor;
    private double gpa;

    public StudentV1(String name, int grade, String address, String dob, char gender){
        this.name = name;
        this.grade = grade;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }

    public StudentV1(String name, int grade, String address, String dob, char gender, double gpa){
        this.name = name;
        this.grade = grade;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public char getGender() {
        return gender;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public String getCounselor() {
        return counselor;
    }

    public double getGpa() {
        return gpa;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getAttendance() {
        return attendance;
    }

    private int studentID;
    private int attendance;


}
