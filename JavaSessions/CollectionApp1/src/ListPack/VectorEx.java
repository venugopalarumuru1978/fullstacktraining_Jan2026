package ListPack;
import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
		List<String>  strList = new Vector<String>();
		strList.add("Nagini");
		strList.add("NagaRaju");
		strList.add("NagaMani");
		strList.add("Nageswar");
		strList.add("Nagini");
		strList.add("Nagarjuna");
		
		System.out.println(strList);
		System.out.println("------------");
		for(String str : strList)
			System.out.println(str);
		System.out.println("------------");
		Iterator  itr = strList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
