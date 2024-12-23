package processingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some text: ");
		String enteredText = input.next();
		System.out.println(enteredText);

		File file = new File("myFile.txt");
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			System.out.println(line);
		}
		scan.close();
	}

}
