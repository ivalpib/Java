package processingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import myUtils.MyUtil;

public class Application {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some text: ");
		String enteredText = input.next();
		System.out.println(enteredText);
		input.close(); // always good to close 
		
		try {
			File file = new File("myFiles.txt");
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				System.out.println(line); 
			}
			scan.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		MyUtil util = new MyUtil();
		try {
			System.out.println(util.calculateNumber(4));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
