package zoo;

public class Bird extends Animal {
	
	public Bird(int age, String gender, String className) {
		super(age, gender, className);
		
	}

	public void move() {
		System.out.println("Bird is Flying..."); 
		
	}
}
