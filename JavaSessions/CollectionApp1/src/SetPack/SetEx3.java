package SetPack;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx3 {

	public static void main(String[] args) {
		Set<String> setStr = new TreeSet<String>();
		
		setStr.add("Monica");
		setStr.add("Mounika");
		setStr.add("Ronika");
		setStr.add("Hansika");
		setStr.add("Monica");
		setStr.add("Ramanika");
		
		System.out.println(setStr);
	}

}
