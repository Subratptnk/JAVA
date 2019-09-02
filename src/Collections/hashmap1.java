package Collections;
import java.util.*;
public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hash Map");
		
		HashMap map = new HashMap<String, Integer>();
		
		System.out.println(map);
		/*
		 * Associates the specified value with the specified key in this map.
		 * If the map previously contained a mapping for the key, the old value is replaced.
		 */
		map.put("Subrat", 90);
		map.put("Manju",80 );
		map.put("Subrat2", 70);
		map.put("Manja",82 );
		
		System.out.println("Size: "+map.size() );
		
		if(map.containsKey("Subrat"))
		{
			 System.out.println("YES");
		}
		System.out.println(map);	
		
		
		
	}

}
