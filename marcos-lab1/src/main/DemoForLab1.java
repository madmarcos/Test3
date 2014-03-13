package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * CS 3443 Application Programming
 * Lab 1
 * <p>
 * Reads tokens from a file data.txt.
 * </p>
 * @author marcos
 *
 */
public class DemoForLab1  {

	/**
	 * Runs this lab demo
	 * @param args Command line arguments for running this program. None used.
	 */
	public static void main(String[] args) {
		//scanner object for reading file
		Scanner scanner = null;//Why do I initialize this?
		try {
			//fully qualified file name
			//scanner = new Scanner(new File("/Users/marcos/Desktop/code/workspace/marcos-lab1/src/main/data.txt"));
			//project top-level dir is also part of file search path
			scanner = new Scanner(new File("src/main/data.txt"));
		} catch (FileNotFoundException e) {
			//abort because no file
			//could we easily hook this up to standard input stream if no file?
			System.out.println("File not found.\n\tAborting program!");
			System.exit(1);
		}
		//scan through file and regurgitate all found tokens
		while(scanner.hasNext()) {
			String token = scanner.next();
			System.out.println("token = " + token);
		}
		//DONT FORGET TO CLOSE THE FILE
		scanner.close();
		
		//also talk about printf
		double fakeSum = 12.850143;
		System.out.printf("fake sum = %.1f%n", fakeSum);
		System.out.println("done");
		System.out.println("and done");
	}

}
