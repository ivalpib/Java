package java_basics;

public class LoopsPractice {

	public static void main(String[] args) {
//		int count = 0;
//		while (count<=100) {
//			if (count == 3) { 
//				count++;
//				continue;
//			}
//			System.out.println(count+": Biplav");
//			count++;
//		}
//		
//		String str = "We have a large inventory of things in out warehouse falling in" 
//				+ "the category: apperal and the slightly "+
//				"more in demand category: makeup along with the category: furniture and ...";
//		printCategories(str);

		int i = 0;
		for (i = 0; i <= 100; i += 2) {
			System.out.println("value of i: " + i);
		}

		forLoop();
	}

	public static void printCategories(String str) {
		int i = 0;
		while (true) {
			int found = str.indexOf("category:", i);
			if (found == -1)
				break;
			int start = found + 10;
			int end = str.indexOf(" ", start);
			System.out.println(str.substring(start, end));
			i = end + 1;
		}

	}

	public static void forLoop() {
		int i = 0;
		for (i = 0; i <= 100; i += 2) {
			System.out.println("value of i: " + i);
		}
	}

}
