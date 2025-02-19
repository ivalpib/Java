package java_basics;

public class Test {

	public static void main(String[] args) {
		String name = tellMyName("Hello ", "Biplav");
		System.out.println(name);
			
	}
	
	public static String tellMyName(String name, String lastName){
		return name+lastName;
	} 

}
