
public class DemoStatic {

	private static int x, y;
	
	
	public static void getData()
	{
		x = 10;
		y = 20;
	}
	
	public static void printData()
	{
		System.out.println("X value is : " + x);
		System.out.println("Y value is : " + y);
		int sum = x+y;
		System.out.println("Sum Value is : " + sum);
	}
}
