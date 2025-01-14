package string.practice;

public class StringsPractice { 

	public static void main(String[] args) {
		// to use compareTo, first character should be same or else give -1 for everything

		String name = "ABiplav";
		String str = "ABCD";
		String str2 = "ABCD";
		String str1 = "ABCDasds";
		
		// if first characters are same, then compare every single character of both string to each other
		// following two prints are to get the Unicode value of non-matching characters on 3rd place
		System.out.println(str.codePointAt(2));
		System.out.println(name.codePointAt(2));

		// when there are different characters after matching first or more, then the system converts each
		// character into Unicode value, then subtract the value of main character to comparing character
		System.out.println(str.compareTo(name));
		System.out.println(105-67); // this is to verify the calculation for above example
		
		// when all the characters of one string matches to another string, it gives 0.
		System.out.println(str.compareTo(str2));
		
		// when all the characters of one string matches to another string and have more characters,
		// the system will count how many more character are more and give the result
		System.out.println(str.compareTo(str1)); // in this case, str1 has four more character, so -4
		
		
		

	}

}
