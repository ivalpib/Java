package zoo;

public class Sparrow extends Bird implements Flyable {

	public Sparrow(int age, String gender, String className) {
		super(age, gender, className);
	}

	public void fly() {
		System.out.println("Sparrow is Flying..."); 
	}

}
