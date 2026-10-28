public class University_System {
	public static class	Student{
		static String	studentID;
		String			name;
		double			gpa;
		int				enrollmentYear;
	}
	public static class	Professor{
		static String	employeeId;
		String			name;
		String			specialization;
		int				yearsOfExperience;
	}
	public static class	Course{
		static String	courseCode;
		String			tittle;
		int				credits;
		String			semester;
	}
	public static class	Classroom{
		static String	roomNumber;
		String			building;
		int				capacity;
		boolean			hasProjector;
	}
	public static class	Departament{
		static String	name;
		String			building;
		String			headName;
	}
}
