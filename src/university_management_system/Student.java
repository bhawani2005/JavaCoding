package university_management_system;

public class Student {
	public int id;
	public String name;
	public String department;

	public Student(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public int getStudentId() {
		return id;
	}

	public String getStudentName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Department=" + department + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student)) return false;
		Student s = (Student) o;
		return this.id == s.id;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(id);
	}
}