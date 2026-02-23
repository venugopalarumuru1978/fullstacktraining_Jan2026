package PolyPack;

// method overriding

class Parent
{
	public void calculate(int x)
	{
		System.out.println(x + " Square Value " + (x*x));
	}
}

class Child extends Parent
{
	public void calculate(int x)
	{
		System.out.println(x + " Cube Value " + (x*x*x));
	}	
}

public class OverrideMain {

	public static void main(String[] args) {

		Parent p1 = new Parent();
		p1.calculate(10);
		p1 =  new Child(); // override
		p1.calculate(10);		
	}
}