package zoo;

public class Zoo {
	
	public static void main(String[] args) {
//		Animal ani1;
//		ani1 = new Animal(2, "Male", "Cat");
//		ani1.info();
//		ani1.sleep();
//		ani1.eat();
		
		Bird bird1 = new Bird(1, "Male", "Sparrow");
//		bird1.info();
		
		Chicken chick = new Chicken(1,"Female","Chicken");
//		chick.info();
//		chick.move();
		//this will invoke fly method in Chicken class which is 
		//overriding fly method in parent class
		//chick.fly(); 
		Fish fish1 = new Fish(1, "Male", "Baramundi");
		Sparrow spa = new Sparrow(1, "Male", "Sparrow1");
//		spa.fly();	
		moveAnimals(spa);
		moveAnimals(fish1);
	}
	
	public static void moveAnimals(Animal animal) {
		animal.move();
	}
}
