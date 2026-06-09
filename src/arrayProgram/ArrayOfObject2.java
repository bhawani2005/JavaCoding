package arrayProgram;

public class ArrayOfObject2 {
	public static void main(String[] args) {
		Animal [] a = new Animal[5];
		a[0] = new Dog("Pluto", 12);
		a[0].eat();
		((Dog)a[0]).bark();
	}
}


class Animal{
	String name; 
	int age;
	
	public Animal (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("animal is eating!!");
	}
}

class Dog extends Animal{
	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void bark() {
		System.out.println("dog is barking..");
	}
}