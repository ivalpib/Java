package com.biplav.learnfilereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import myUtils.MyUtil;
//import myUtils.MyUtil.CalculateException;

public class Application {

	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("myFile.txt");
		MyUtil abc = new MyUtil();
		Calculate ab = new Calculate();
		try {
			System.out.println(ab.CalculateSomething("something"));
			abc.calculateNumber(3); 
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) { 
				String line = scan.nextLine();
				System.out.println(line);
			}
			
		}  catch (myUtils.MyUtil.CalculateException  e) {
			e.printStackTrace();
		}
		catch (CalculateException e) {
			e.printStackTrace();
		}
		

	}

}
