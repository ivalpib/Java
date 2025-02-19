package zoo;

public class Zoo {

	public static void main(String[] args) {
		Animal parrot = new Parrot("Parrot",2,"Bird");
		Animal mouse = new Mouse("Mouse",1,"Mammal");
		Animal chicken = new Chicken("Chicken",2,"Bird");
		mouse.move();
		movement(mouse);
//		parrot.fly();
		parrot.move();
		movement(parrot);
		
		chicken.move();
		movement(chicken);
		
		Flyable flyingBird = new Parrot("Parrot",3,"Bird");
		flyingBird.fly();
		
	}  
	public static void movement(Animal animal) {
		animal.move();
	}
}
 