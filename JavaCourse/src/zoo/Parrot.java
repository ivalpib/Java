package zoo;

public class Parrot extends Bird implements Flyable{

	public Parrot(String name, int age, String type) {
		super(name, age, type);
		
	}

	public void move() {
		System.out.println("Parrot flies for movement.");
	}


	public void fly() {
		System.out.println("Parrot flies for movement.");
	}
	
}
