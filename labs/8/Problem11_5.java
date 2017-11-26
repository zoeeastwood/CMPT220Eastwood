
public class Problem11_5 {
	public static void main(String[] args) {
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");

		course1.addStudent("Zoe Eastwood");
		course1.addStudent("John Apple");
		course1.addStudent("Annie");

		course2.addStudent("Hob");
		course2.addStudent("Joe");

		System.out.println("Number of students in course1: "
			+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");

		System.out.println();
		System.out.print("Number of students in course2: "
			+ course2.getNumberOfStudents());
	}
}

//} JA