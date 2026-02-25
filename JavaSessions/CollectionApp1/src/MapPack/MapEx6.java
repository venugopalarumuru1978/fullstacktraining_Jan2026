package MapPack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx6 {
// TreeMap
	public static void main(String[] args) {
		Map<Integer, String> mapHttpErrors = new TreeMap<Integer, String>();
		
		mapHttpErrors.put(500, "Internal Server Error");
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(404, "Not Found");
		
		System.out.println(mapHttpErrors);
		
		for(Map.Entry<Integer, String> http : mapHttpErrors.entrySet())
		{
			System.out.println(http.getKey() + "<---->" + http.getValue());
		}
	}
}
