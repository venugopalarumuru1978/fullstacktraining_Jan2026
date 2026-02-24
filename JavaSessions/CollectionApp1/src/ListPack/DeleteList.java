package ListPack;
import java.util.*;

public class DeleteList {

	public static void main(String[] args) {
		List<String>  strList = new ArrayList<String>();
		strList.add("Nagini");
		strList.add("NagaRaju");
		strList.add("NagaMani");
		strList.add("Nageswar");
		strList.add("Nagini");
		strList.add("Nagarjuna");
		
		System.out.println(strList);
		System.out.println("------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to search");
		String str = sc.next();
		
		if(strList.contains(str))
		{
			strList.remove(str);
			System.out.println("Value Deleted...");
			System.out.println(strList);
		}
		else
			System.out.println("Value not existed...");
	}
}
