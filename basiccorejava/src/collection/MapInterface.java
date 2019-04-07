package collection;

import java.util.HashMap;
import java.util.Hashtable;

public class MapInterface {

	public static void main(String[] args) {
	HashMap<String, String> map=new HashMap<String, String>();
    
			map.put("name","Prandhya");
	map.put("surname","abc");
	map.put("org", "pqr");
	map.put(null, "pqr");
	System.out.println(map.get(null));
	
	Hashtable<String, String> map2=new Hashtable<String, String>();
    
	map2.put("name","Prandhya");
map2.put("surname","abc");
map2.put("org", "pqr");
map2.put(null, "pqr");
System.out.println(map2.get(null));

	
	}

}
