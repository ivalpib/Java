package zoo;

public class Chicken extends Bird {

	public Chicken(String name, int age, String type) {
		super(name, age, type);
		
	}
	public void move(){
		System.out.println("Chicken runs on ground and does not fly.");
	}

}
