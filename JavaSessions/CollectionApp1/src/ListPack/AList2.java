package ListPack;
import java.util.*;

public class AList2 {

	public static void main(String[] args) {
		List<Integer>  intList = new ArrayList<Integer>();
		
		intList.add(101);
		intList.add(102);
		intList.add(103);
		intList.add(104);
		intList.add(105);
		
		System.out.println(intList);
		System.out.println("------------");
		for(int n : intList)
			System.out.println(n);
		System.out.println("------------");
		Iterator  itr = intList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
