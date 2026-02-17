
public class ConsApp {

	public static void main(String[] args) {
		DemoCons dc1 = new DemoCons();
		dc1.printVal();

		System.out.println("---------------");

		ConsParam cp1 = new ConsParam(100,200);
		cp1.printVal();

		ConsParam cp2 = new ConsParam(120,220);
		cp2.printVal();
		
		System.out.println("---------------");
		
		MiultiCons mc1 = new MiultiCons();
		mc1.printVal();
		
		MiultiCons mc2 = new MiultiCons(55,66);
		mc2.printVal();
	}

}
