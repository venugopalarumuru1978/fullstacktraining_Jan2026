package PolyPack;
// method overloading
class ShapesArea
{
	public static void Area(float r)
	{
		System.out.println("Area of Circle is " + (3.14f*r*r));
	}
	
	public static void Area(float l, float b)
	{
		System.out.println("Area of Rectangle is : " + (l*b));
	}
	
	public static void Area(int b, int h)
	{
		System.out.println("Area of Traingle is : " + (0.5f*b*h));
	}
}

class BigNumber 
{
	public void Big(int x, int y)
	{
		if(x>y)
			System.out.println(x + " and " + y + " Big Number is " + x);
		else
			System.out.println(x + " and " + y + " Big Number is " + y);
	}
	
	public void Big(float x, float y)
	{
		if(x>y)
			System.out.println(x + " and " + y + " Big Number is " + x);
		else
			System.out.println(x + " and " + y + " Big Number is " + y);
	}
	
	public void Big(float x, int y)
	{
		if(x>y)
			System.out.println(x + " and " + y + " Big Number is " + x);
		else
			System.out.println(x + " and " + y + " Big Number is " + y);
	}
}
public class PolyMain {

	public static void main(String[] args) 
	{
			ShapesArea.Area(1.5f);
			ShapesArea.Area(4,5);
			ShapesArea.Area(4.4f,5.5f);
			System.out.println("----------");
			BigNumber b = new BigNumber();
			b.Big(12, 4);
			b.Big(12.45f, 23.0f);
			b.Big(14.5f, 30);
	}

}
