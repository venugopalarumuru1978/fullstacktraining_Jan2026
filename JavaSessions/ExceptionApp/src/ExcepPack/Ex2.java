package ExcepPack;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {		
		Scanner  sc = new Scanner(System.in);
		try {
			System.out.println("Enter two values");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int div  = x/y;
			
			System.out.println("Division : " + div);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			System.out.println("Value should not divide with zero");
		}
	}
}
