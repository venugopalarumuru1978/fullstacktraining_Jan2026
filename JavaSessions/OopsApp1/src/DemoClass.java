public class DemoClass {

	private	int x, y;
	
	public	void getData()
	{
		x = 10;
		y = 20;
	}
	
	public void putData()
	{
		System.out.println("X value is : " + x);
		System.out.println("Y value is : " + y);
		int sum = x+y;
		System.out.println("Sum Value is : " + sum);
	}
}
