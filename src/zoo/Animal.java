package zoo;

public class Animal {
	int age;
	String gender;
	String className;
	
	
	public Animal(int age, String gender, String className) {
		super();
		this.age = age;
		this.gender = gender;
		this.className = className;
	}


	public void info() {
		System.out.println("This is a " + className);
		System.out.println("This "+className+" is "+ age + " years old and it is a "+gender);
	}
	
	public void eat() {
		System.out.println("Eating....");
	}
	public void sleep() {
		System.out.println("Sleeping....");
	}

}
