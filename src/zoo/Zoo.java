package zoo;

public class Zoo {
	
	public static void main(String[] args) {
		Animal ani1;
		ani1 = new Animal(2, "Male", "Cat");
		ani1.info();
		ani1.sleep();
		ani1.eat();
		
		Bird bird1 = new Bird();
		bird1.fly();
		
	}
}
