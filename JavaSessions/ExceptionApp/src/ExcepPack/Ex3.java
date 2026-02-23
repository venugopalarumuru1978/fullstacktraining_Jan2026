package ExcepPack;

import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) throws IOException {	
		/*
		 * System.in.read() method is used to read a character in the form of ascii value.
		 */
		
		System.out.println("Enter any character ");
		int ch = System.in.read();
				
		System.out.println("Given Char : " + (char)ch);
	}
}
