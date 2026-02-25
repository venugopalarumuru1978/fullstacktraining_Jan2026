package SetPack;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		Set<String> setStr = new HashSet<String>();
		
		setStr.add("Monica");
		setStr.add("Mounika");
		setStr.add("Ronika");
		setStr.add("Hansika");
		setStr.add("Monica");
		setStr.add("Ramanika");
		
		System.out.println(setStr);
	}

}
