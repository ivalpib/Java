package java_basics;

public class MyUtils {

	public static String printSomeJunk(String argument) {
//		System.out.println("blah blah blah "+ argument);
		return argument;
	}
	public static int printSomeJunk(int argument) {
//		System.out.println("Integer passed in: "+ argument);
		return argument;
	}
	
	public static void sum2Numbers(int firstArg, int secondArg) {
		System.out.println(firstArg+secondArg);
	}
	public static int add10(int someArg) {
		int result = someArg + 10;
		return result; 
	}
}
