package ExcepPack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {		
		Scanner  sc = new Scanner(System.in);
		try {
			System.out.println("Enter two values");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int div  = x/y;
			
			System.out.println("Division : " + div);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Value should not divide with zero");
		}
		catch(InputMismatchException mis)
		{
			System.out.println("Enter only integers");
		}
		catch(Exception ex)
		{
			System.out.println(ex);			
		}
		finally
		{
			System.out.println("Finally Block");
		}
	}
}