package university_management_system;

import java.util.Vector;

public class University {
	Vector<Student> students;
	Vector<Course> courses;
	Vector<Enrollment> enrollments;
	private int nextEnrollmentId = 100; // dedicated counter, immune to ID reuse after drops

	public University() {
		this.students = new Vector<Student>();
		this.courses = new Vector<Course>();
		this.enrollments = new Vector<Enrollment>();
	}

	public Vector<Student> getStudents() {
		return students;
	}

	public Vector<Course> getCourses() {
		return courses;
	}

	public Vector<Enrollment> getEnrollments() {
		return enrollments;
	}

	public String addStudent(Student s) {
		for (Student student : students) {
			if (student.equals(s)) {
				return "Student data already exists....";
			}
		}
		students.add(s);
		return "Student added successfully.";
	}

	public String addCourse(Course c) {
		for (Course course : courses) {
			if (course.equals(c)) {
				return "Course data already exists....";
			}
		}
		courses.add(c);
		return "Course added successfully.";
	}

	public String enrollStudent(int studentId, int courseId, double gread) {
		Student student = null;
		Course course = null;

		for (Student s : students) {
			if (s.id == studentId) {
				student = s;
			}
		}

		for (Course c : courses) {
			if (c.courseId == courseId) {
				course = c;
			}
		}

		if (student == null) {
			return "Student not found....";
		}

		if (course == null) {
			return "Course not found....";
		}

		for (Enrollment e : course.enrollments) {
			if (e.student.equals(student)) {
				e.gread = gread;
				return "Student already enrolled in this course. Grade updated.";
			}
		}

		if (course.maxStudent <= course.enrollments.size()) {
			return "Course has reached its student capacity....";
		}

		Enrollment e = new Enrollment(nextEnrollmentId++, student, course, gread);
		enrollments.add(e);
		course.enrollments.add(e);
		return "Enrollment successful. Enrollment ID: " + e.enrollmentId;
	}

	public String dropEnrollment(int enrollId) {
		for (Enrollment e : enrollments) {
			if (e.enrollmentId == enrollId) {
				e.course.enrollments.remove(e);
				enrollments.remove(e);
				return "Enrollment dropped successfully.";
			}
		}
		return "Enrollment not found....";
	}

	public void displayStudents() {
		for (Student s : students) {
			System.out.println(s.toString());
		}
	}

	public void displayCourses() {
		for (Course c : courses) {
			System.out.println(c.toString());
		}
	}

	public void displayEnrolls() {
		for (Enrollment e : enrollments) {
			System.out.println(e.toString());
		}
	}

	public String calculateAverageGrade(int courseId) {
		for (Course c : courses) {
			if (c.courseId == courseId) {
				if (c.enrollments.isEmpty()) {
					return "Course \"" + c.courseName + "\" has no enrollments yet.";
				}
				double sum = 0;
				for (Enrollment e : c.enrollments) {
					sum += e.gread;
				}
				double average = sum / c.enrollments.size();
				return String.format("Average grade of %s is: %.2f", c.courseName, average);
			}
		}
		return "Given course ID not found.....";
	}
}