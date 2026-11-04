package university;

public class Student {

    private String studentID;
    private String name;
    private int enrollmentYear;
    private double gpa;

    public Student(String studentID, String name, double gpa, int enrollmentYear) {
        this.studentID = studentID;
        this.name = name;
        this.enrollmentYear = enrollmentYear;
        if (gpa < 0 || gpa > 4) {
            throw new IllegalArgumentException("GPA value should be from 0 to 4!");
        } else {
            this.gpa = gpa;
        }
    }

    public String getstudentID() {
        return (studentID);
    }

    public String getname() {
        return (name);
    }

    public double getgpa() {
        return (gpa);
    }

    public int enrollmentYear() {
        return (enrollmentYear);
    }

    public void setgpa(double gpa) {
        if (this.gpa >= 0 || this.gpa <= 4) {
            this.gpa = gpa;
        } else {
            System.out.println("The GPA value its not correct!");
        }
    }

    public void academicStanding() {
        if (this.gpa >= 2.0) {
            System.out.println("Good standing");
        } else if (this.gpa >= 1.5 && this.gpa <= 2.0) {
            System.out.println("Academic probation");
        } else {
            System.out.println("Academic warning");
        }
    }

    
}
