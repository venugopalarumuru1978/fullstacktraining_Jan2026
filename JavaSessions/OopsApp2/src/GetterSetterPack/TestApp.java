package GetterSetterPack;

public class TestApp {

	public static void main(String[] args) {
		DemoGetterAndSetter  dgs = new DemoGetterAndSetter();
		dgs.setPname("Pavan Kumar");
		dgs.setAge(12);
		
		System.out.println("Person Name : " +  dgs.getPname());
		System.out.println("Person Age : " +  dgs.getAge());
	}
}
