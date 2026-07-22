package university_management_system;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		University u = new University();

		u.addStudent(new Student(401, "Raghu", "CS"));
		u.addStudent(new Student(402, "Akash", "IT"));
		u.addStudent(new Student(403, "Bikash", "CS"));
		u.addStudent(new Student(404, "Kunal", "CS"));
		u.addStudent(new Student(405, "Karan", "IT"));

		u.addCourse(new Course(101, "JAVA", 10));
		u.addCourse(new Course(102, "PYTHON", 2));
		u.addCourse(new Course(103, "REACT", 5));

		u.enrollStudent(401, 102, 91.0);
		u.enrollStudent(402, 102, 64.0);
		u.enrollStudent(403, 101, 92.0);
		u.enrollStudent(404, 101, 84.0);
		u.enrollStudent(405, 103, 85.0);

		while (true) {
			System.out.println("\n===== UNIVERSITY MANAGEMENT SYSTEM =====");
			System.out.println("1. Add Student");
			System.out.println("2. Add Course");
			System.out.println("3. Enroll Student");
			System.out.println("4. Drop Enrollment");
			System.out.println("5. Display Students");
			System.out.println("6. Display Courses");
			System.out.println("7. Display Enrollments");
			System.out.println("8. Calculate Average Grade");
			System.out.println("9. Exit");

			System.out.println("Enter your Choice : ");
			int choice = sc.nextInt();

			switch (choice) {
				case 1 -> {
					System.out.println("Enter student details: ");
					System.out.print("ID: ");
					int id = sc.nextInt();
					System.out.print("Name: ");
					String name = sc.next();
					System.out.print("Department: ");
					String department = sc.next();

					System.out.println(u.addStudent(new Student(id, name, department)));
				}

				case 2 -> {
					System.out.println("Enter course details: ");
					System.out.print("ID: ");
					int id = sc.nextInt();
					System.out.print("Name: ");
					String name = sc.next();
					System.out.print("Max student: ");
					int maxStudent = sc.nextInt();

					System.out.println(u.addCourse(new Course(id, name, maxStudent)));
				}

				case 3 -> {
					System.out.println("Enter details for Enroll Student: ");
					System.out.println("Student ID: ");
					int sId = sc.nextInt();
					System.out.println("Course ID: ");
					int cId = sc.nextInt();
					System.out.println("Grade: ");
					double grade = sc.nextDouble();

					System.out.println(u.enrollStudent(sId, cId, grade));
				}

				case 4 -> {
					System.out.println("Enter Enroll ID for Drop Enrollment: ");
					int id = sc.nextInt();

					System.out.println(u.dropEnrollment(id));
				}

				case 5 -> {
					System.out.println("Students are: ");
					u.displayStudents();
				}

				case 6 -> {
					System.out.println("Courses are: ");
					u.displayCourses();
				}

				case 7 -> {
					System.out.println("Enrollments are: ");
					u.displayEnrolls();
				}

				case 8 -> {
					System.out.println("Enter Course ID for display average grade: ");
					int cId = sc.nextInt();

					System.out.println(u.calculateAverageGrade(cId));
				}

				case 9 -> {
					System.out.println("Thank You.....");
					sc.close();
					System.exit(0);
				}
				default -> System.out.println("Invalid Choice...\nEnter Again....");
			}
		}
	}
}