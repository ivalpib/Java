package human;

import java_basics.MyUtils;

public class Earth {

	public static void main(String[] args) {

		System.out.println(MyUtils.printSomeJunk("This is some piece of data"));
		Human tom;
		tom = new Human("Tom Hagen", 17, "Brown", "Male");
		tom.speak();
		Human Henri;
		Henri = new Human("Henri Sombat", 18, "White", "Male");
		Henri.speak();

	}

}
