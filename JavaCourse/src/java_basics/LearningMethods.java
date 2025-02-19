package java_basics;

public class LearningMethods {

	public static void main(String[] args) {
		
		String randString = MyUtils.printSomeJunk("This is some piece of data");
		System.out.println(randString);
		int randNum = MyUtils.printSomeJunk(37);
		System.out.println(randNum);
		MyUtils.sum2Numbers(10, 23);
		int myvar = MyUtils.add10(99)+100 - 10;
		System.out.println(myvar);
	}
	 

}
