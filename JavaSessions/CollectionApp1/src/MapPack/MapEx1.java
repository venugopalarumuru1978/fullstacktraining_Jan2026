package MapPack;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
// Add and Retrival
	public static void main(String[] args) {
		Map<Integer, String> mapHttpErrors = new HashMap<Integer, String>();
		
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(404, "Not Found");
		mapHttpErrors.put(500, "Internal Server Error");
		
		System.out.println(mapHttpErrors);
		
		for(Map.Entry<Integer, String> http : mapHttpErrors.entrySet())
		{
			System.out.println(http.getKey() + "<---->" + http.getValue());
		}
	}
}
