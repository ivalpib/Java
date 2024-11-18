package human;

public class Human {
	String name;
	int age;
	String color;
	String gender;
	
	public Human(String name, int age, String color, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.gender = gender;
}
	
	
	public void speak() {
		System.out.println("Hello, my name is "+name);
		System.out.println("I am "+age+" years old and a "+gender);
		System.out.println("My skin color is "+color);
	}
	public void eat() {
		System.out.println("I am eating..");	
	}
	public void walk() {
		System.out.println("I am walking..");	
	}
	public void work() {
		System.out.println("I am working..");	
	}
}
