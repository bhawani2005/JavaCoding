package inheritance;


public class AnimalMain {
	public static void main(String[] args) {
		Dog d1 = new Dog("Saru", 5, "Jarman Saphard");
		d1.displayDetails();
		d1.eat();
		d1.bark();
	}
}

class Animal{
	public String name;
	public int age;
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	public void eat() {
		System.out.println("Animal is eating.");
	}
	
}

class Dog extends Animal{
	public String breed;

	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Breed: "+breed);
	}
	
	public void eat() {
		System.out.println("Dog is eating.");
	}
	
	public void bark() {
		System.out.println("Dog is barking..");
	}
}