
public class MiultiCons {

	private int x,y;
	
	public MiultiCons()
	{
		System.out.println("It is a Constructor without parameter");
		this.x = 100;
		this.y = 200;
	}
	
	public MiultiCons(int x, int y)
	{
		System.out.println("It is a Constructor with parameter");
		this.x = x;
		this.y = y;
	}

	public void printVal()
	{
		System.out.println("X val : " + x);
		System.out.println("Y val : " + y);
	}
	
}
