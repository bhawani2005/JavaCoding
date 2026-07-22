package vectorPrograms;

import java.util.Vector;

public class PlatformQuestion1 {
	public static void main(String[] args) {
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
		//u.enrollStudent(405, 104, 93.0);
		
		u.calculateAverageGrade(101);
		u.displayCourses();
	}
}


class Student{
	public int id;
	public String name;
	public String Department;
	
	public Student(int id, String name, String department) {
		this.id = id;
		this.name = name;
		Department = department;
	}
	
	

	public int getStudentId() {
		return id;
	}



	public String getStudentName() {
		return name;
	}



	public String getDepartment() {
		return Department;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Department=" + Department + "]";
	}
	
	public boolean equals(Object o) {
		Student s = (Student)o;
		return this.id == s.id;
	}
}

class Course{
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
		return "Course [courseId=" + courseId + ", name=" + courseName + ", maxStudent=" + maxStudent +"No of Students : "+enrollments.size()+"]";
	}
	
	public boolean equals(Object o) {
		Course c = (Course)o;
		return this.courseId == c.courseId;
	}
}

class Enrollment{
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
		return "Enrollment [enrollmentId=" + enrollmentId + ", student=" + student.name + ", course=" + course.courseName + ", gread="
				+ gread + "]";
	}
}

class University{
	Vector<Student> students;
	Vector<Course> courses;
	Vector<Enrollment> enrollments;
	
	public University() {
		this.students = new Vector<Student>();
		this.courses = new Vector<Course>();
		this.enrollments = new Vector<Enrollment>();
	}
	
	public void addStudent(Student s) {
		for(Student student : students) {
			if(student.equals(s)) {
				System.out.println("Student data is already Exits.....");
				return;
			}
		}
		students.add(s);
	}
	
	public void addCourse(Course c) {
		for(Course course : courses) {
			if(course.equals(c)) {
				System.out.println("Course data is already Exits....");
				return;
			}
		}
		courses.add(c);
	}
	
	public void enrollStudent(int studentId, int courseId, double gread) {
		Student student = null;
		Course course = null;
		
		for(Student s : students) {
			if(s.id == studentId) {
				student = s;
			}
		}
		
		for(Course c : courses) {
			if(c.courseId == courseId) {
				course = c;
			}
		}
		
		if(student == null) {
			System.out.println("Student not found....");
			return;
		}
		
		if(course == null) {
			System.out.println("Course not found....");
			return;
		}
		
		for(Enrollment e : course.enrollments) {
			if(e.student.equals(student)) {
				System.out.println("Course is already enrolled by student....");
				e.gread = gread;
				return;
			}
		}
		
		if(course.maxStudent <= course.enrollments.size()) {
			System.out.println("Course reached its students capacity....");
			return;
		}
		
		Enrollment e = new Enrollment(enrollments.size()+100, student, course, gread);
		enrollments.add(e);
		course.enrollments.add(e);
	}
	
	public void dropEnrollment(int enrollId) {
		for(Enrollment e : enrollments) {
			if(e.enrollmentId == enrollId) {
				e.course.enrollments.remove(e);
				enrollments.remove(e);
				return;
			}
		}
		System.out.println("Enrollment not found...");
	}
	
	public void displayCourses() {
		for(Course c : courses) {
			System.out.println(c.toString());
		}
	}
	
	public void calculateAverageGrade(int courseId) {
		for(Course c : courses) {
			if(c.courseId == courseId) {
				int sum = 0;
				for(Enrollment e : c.enrollments) {
					sum += e.gread;
				}
				System.out.println("Average gread of "+c.courseName+" is : "+sum/c.enrollments.size());
				return;
			}
		}
		System.out.println("Given course id not found.....");
	}
}