package MapPack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx3 {
// delete value based key
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
			System.out.println("Value is : " + mapHttpErrors.get(scode));
			mapHttpErrors.remove(scode);
			System.out.println(mapHttpErrors);
		}
		else
			System.out.println("Key Not Found....");
	}
}