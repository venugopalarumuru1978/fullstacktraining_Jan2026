package ExcepPack;

import java.io.IOException;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) throws IOException {	
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter person age");
			int age = sc.nextInt();
			
			if(age<18)
				throw  new InvalidAgeException("Error ! age not sufficient");
			else
				System.out.println("Voter Registed");
		} 
		catch(InvalidAgeException ex)
		{
			System.out.println(ex);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
