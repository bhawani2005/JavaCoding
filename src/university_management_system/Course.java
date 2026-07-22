package university_management_system;

import java.util.Vector;

public class Course {
	public int courseId;
	public String courseName;
	public int maxStudent;
	public Vector<Enrollment> enrollments;

	public Course(int courseId, String name, int maxStudent) {
		super();
		this.courseId = courseId;
		this.courseName = name;
		this.maxStudent = maxStudent;
		this.enrollments = new Vector<>();
	}

	public int getCourseId() {
		return courseId;
	}

	public String getName() {
		return courseName;
	}

	public int getMaxStudent() {
		return maxStudent;
	}

	public Vector<Enrollment> getEnrollments() {
		return enrollments;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + courseName + ", maxStudent=" + maxStudent
				+ ", No of Students=" + enrollments.size() + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Course)) return false;
		Course c = (Course) o;
		return this.courseId == c.courseId;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(courseId);
	}
}