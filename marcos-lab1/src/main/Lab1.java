package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * CS 3443 Application Programming
 * Lab 1
 * <p>
 * Reads tokens from a file data.txt. Counts # of numeric tokens
 * , # of non-numeric tokens, and calcs sum of numeric tokens
 * </p>
 * @author marcos
 *
 */
public class Lab1 {

	/**
	 * Runs the Lab1 application
	 * @param args command line arguments for the Lab 1 application
	 */
	public static void main(String[] args) {
		//intro Scanner object
		Scanner scanner = null;
		//intro File object
		//briefly explain Try/Catch and exception handling
		try {
			scanner = new Scanner(new File("src/main/data.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//explain System.exit
			System.exit(1);
		}
		int countNumeric = 0, countNonNumeric = 0;
		double sumNumeric = 0.0;
		//scan through file and count numeric tokens, non-numeric
		//and if numeric, add to sum
		while(scanner.hasNext()) {
			if(scanner.hasNextInt()) {
				int intToken = scanner.nextInt();
				sumNumeric += (double) intToken;
				countNumeric++;
			} else if(scanner.hasNextDouble()) {
				double dToken = scanner.nextDouble();
				sumNumeric += dToken;
				countNumeric++;
			} else {
				String trash = scanner.next();
				countNonNumeric++;
			}
		}
		//DONT FORGET TO CLOSE THE FILE
		scanner.close();

		System.out.print(countNumeric + " " + countNonNumeric + " ");
		System.out.printf("%.1f%n", sumNumeric);
	}

}
