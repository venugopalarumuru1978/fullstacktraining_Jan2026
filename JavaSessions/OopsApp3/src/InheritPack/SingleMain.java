package InheritPack;

class Parent
{
	protected int x, y;
	
	void getData(int x, int y)
	{
		this.x = x;
		this.y = y;
	}	
}

class Child extends Parent
{
	private int sum;
	
	void putData()
	{
		sum = x+y;
		System.out.println("X val : " + x);
		System.out.println("Y val : " + y);
		System.out.println("Sum val : " + sum);
	}
}

public class SingleMain {

	public static void main(String[] args)
	{
		Child chObj = new Child();
		chObj.getData(10, 20);
		chObj.putData();
	}
}

