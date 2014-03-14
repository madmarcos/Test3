package main;

import java.util.*;

/**
 * Demo program to show use of scanner to receive user input until user types exit/done/quit
 * @author marcos
 *
 */
public class ScannerExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type exit/done/quit to stop entering stuff:");
		boolean done = false;
		while(!done) {
			String line = input.nextLine();
			if(line.equals("quit") || line.equals("exit") || line.equals("done"))
				done = true;
			else
				System.out.println("You typed: " + line);
		}
		System.out.println("Finished again");
		System.out.println("Finished again from user 1");
	}

}
