package typeOfClass;

public class SingletonClass {
	public static void main(String[] args) {
		Student s1 = Student.getObject("Ravi", 21, 89.23);
		Student s2 = Student.getObject("Abhi", 21, 85.23);
		
		System.out.println(s1);
		System.out.println(s2);

	}
}

//Singleton Class
class Student {
	static Student student;
    String name;
    int age;
    double percentage;


    private Student(String name, int age, double percentage) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }
    
    public static Student getObject(String name, int age, double percentage) {
    	if(student == null) {
    		student = new Student(name, age, percentage);
    	}
    	return student;
    }

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", percentage=" + percentage + "]";
	}
    
    
}