package university;

public class Student {
    private String			studentID;
	private String			name;
	private double			gpa;
	private int				enrollmentYear;
	public void Student(String studentID, String name, double gpa, int enrollmentYear) {
		this.studentID = studentID;
		this.name = name;
		this.gpa = gpa;
		this.enrollmentYear = enrollmentYear;
	}
	public String	getstudentID(){ return (studentID);}
	public String	getname(){ return (name); }
	public double	getgpa(){ return(gpa); }
	public int		enrollmentYear(){ return(enrollmentYear); }

}
