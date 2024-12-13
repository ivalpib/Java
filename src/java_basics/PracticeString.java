package java_basics;

public class PracticeString {

	public static void main(String[] args) {
		String str = "ABCDEFGH"; 
		String extractedString = str.substring(1); //prints BCDEFGH
		System.out.println(extractedString);
		
		String extractedString2 = str.substring(1,3); // prints BC
		System.out.println(extractedString2);
		
		//comparing strings
		
		String a = "hello";
		String b = "there";
		
		if (a == "hello") {
			// we should not compare string like this
			// == compares whether both variables point to the same memory location.
			// .equals() compares the actual content of the strings.
		}
		if (a.equals("hello")) {
			// always use this to compare if type is object
		}
		
		if (b.equals("There")){
			// if there is slight difference even it is a uppercase or lower, it's not equal.
		}
		
		if (a.equalsIgnoreCase("Hello")) {
			//this will ignore the case sensitivity.
		}
		
		//extracting characters where char holds just a character
		System.out.println(a.charAt(0)); //print H
		System.out.println(a.charAt(4)); // print O
		
		//check index position
		String str2 = "Hello there My name is Biplav name";
		int check = str2.indexOf("name"); // checks from left to right
		System.out.println(check); 
		int check1 = str2.lastIndexOf("name"); // checks from right to left
		System.out.println(check1); 
		
	}

}
