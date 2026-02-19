package InheritPack;

class Parent1
{
	protected int x;
	
	public Parent1()
	{
		this.x = 100;
		System.out.println("this is parent class constructor");
	}
}


class Child1 extends Parent1
{
	
	public Child1()
	{
		System.out.println("this is child class constructor");
	}
	
	public void print()
	{
		System.out.println("X vlaue : " + x);
	}
}

public class ConsInherit {

	public static void main(String[] args) {
		
		Child1 ch1= new Child1();
		ch1.print();

	}

}
