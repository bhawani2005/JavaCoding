package classTypeCasting;

public class AnimalMain {
	public static void main(String[] args) {
		Animal d1 = (Animal) new Dog("Pluto", 2, "pit bull", "black");
		Animal c1 = (Animal) new Cat("Meoo", 2);
		
		Animal c2 = new Cat("Meoo", 2);
		
		Cat d = (Cat)c2;
	}
}

class Animal{
	String name;
	int age;
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}	
}

class Dog extends Animal{
	
	String bread;
	String color;
	public Dog(String name, int age, String bread, String color) {
		super(name, age);
		this.bread = bread;
		this.color = color;
	}	
}

class Cat extends Animal{

	public Cat(String name, int age) {
		super(name, age);
	}

	
	
}