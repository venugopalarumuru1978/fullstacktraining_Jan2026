package SetPack;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		Set<String> setStr = new LinkedHashSet<String>();
		
		setStr.add("Monica");
		setStr.add("Mounika");
		setStr.add("Ronika");
		setStr.add("Hansika");
		setStr.add("Monica");
		setStr.add("Ramanika");
		
		System.out.println(setStr);
	}

}
