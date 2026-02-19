package InheritPack;

class Parent2
{
	protected int x;
	
	public Parent2(int x)
	{
		this.x = x;
		System.out.println("this is parent class constructor");
	}
}

class Child2 extends Parent2
{
	private float b;
	public Child2(float b, int a)
	{
		super(a);
		this.b = b;
		System.out.println("this is child class constructor");
	}
	
	public void print()
	{
		System.out.println("X vlaue : " + x);
		System.out.println("B vlaue : " + b);
	}
}

public class ConsInherit2 {

	public static void main(String[] args) {
		
		Child2 ch = new Child2(12.45f, 56);
		ch.print();
	}

}
