package zoo;

public abstract class Animal {
	String name;
	int age;
	String type;
	
	public Animal(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
	}  
	public void eat() {
		System.out.println("is eating...");
	}
	public void sleep() {
		System.out.println("is sleeping...");
	}
	
	public abstract void move();
}
