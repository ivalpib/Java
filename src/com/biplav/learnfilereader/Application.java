package com.biplav.learnfilereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import myUtils.MyUtil;
//import myUtils.MyUtil.CalculateException;

public class Application {

	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("myFile.txt");
		try (MyUtil abc = new MyUtil();
				Calculate ab = new Calculate();
				Scanner scan = new Scanner(file)) {
			try {
				System.out.println(ab.CalculateSomething("none"));
				abc.calculateNumber(3);
				while (scan.hasNextLine()) {
					String line = scan.nextLine();
					System.out.println(line);
				}
			} catch (CalculateException e) {
				e.printStackTrace();
			} catch (myUtils.MyUtil.CalculateException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
