package MapPack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx4 {
// Modify value based key
	public static void main(String[] args) {
		Map<Integer, String> mapHttpErrors = new HashMap<Integer, String>();
		
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(404, "Not Found");
		mapHttpErrors.put(500, "Internal Server Error");
		
		System.out.println(mapHttpErrors);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Status Code ");
		int scode = sc.nextInt();
		
		if(mapHttpErrors.containsKey(scode))
		{
			System.out.println("Present Value is : " + mapHttpErrors.get(scode));
			System.out.println("Enter New Value ");
			String sval = sc.next();
			mapHttpErrors.replace(scode, sval);
			System.out.println(mapHttpErrors);
		}
		else
			System.out.println("Key Not Found....");
	}
}