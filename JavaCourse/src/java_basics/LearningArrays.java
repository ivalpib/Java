package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		int [] values = new int[100];
		values[0] = 1000;
		values[99]=97343;
		System.out.println(values[99]);
		
		String [] words = new String[3];
		words[0] = "My";
		words[1]= "Name";
		words[2]="is";
		System.out.println(words[1]);
		words = new String[10];
		System.out.println(words[2]); // this won't have previous data and gives null
	}

}
