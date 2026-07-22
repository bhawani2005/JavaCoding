package university_management_system;

public class Enrollment {
	public int enrollmentId;
	public Student student;
	public Course course;
	public double gread;

	public Enrollment(int enrollmentId, Student student, Course course, double gread) {
		this.enrollmentId = enrollmentId;
		this.student = student;
		this.course = course;
		this.gread = gread;
	}

	public int getEnrollmentId() {
		return enrollmentId;
	}

	public Student getStudent() {
		return student;
	}

	public Course getCourse() {
		return course;
	}

	public double getGread() {
		return gread;
	}

	public void setGread(double gread) {
		this.gread = gread;
	}

	@Override
	public String toString() {
		return "Enrollment [enrollmentId=" + enrollmentId + ", student=" + student.name + ", course="
				+ course.courseName + ", gread=" + gread + "]";
	}
}