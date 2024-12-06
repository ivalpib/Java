package zoo;

public class Mouse extends Animal {

	public Mouse(String name, int age, String type) {
		super(name, age, type);
		
	}
	
	public void move() {
		System.out.println("Mouse runs for movement.");
	}

}
