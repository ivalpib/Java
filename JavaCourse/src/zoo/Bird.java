package zoo;

public class Bird extends Animal {

	public Bird(String name, int age, String type) {
		super(name, age, type);
		
	}
	
	public void move() {
		System.out.println("Bird want to fly");
	}
	
}
