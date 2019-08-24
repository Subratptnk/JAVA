/*
 *  Create an ArrayList that can store only Strings. 
Create a printAll method that will print all the elements of the ArrayList using an Iterator.
 */
package Collections;
import java.util.*;
public class list03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hello");
		list.add("world");
		list.add("Aham Bramashmi");
		
		printlist(list);
	}

	private static void printlist(ArrayList<String> list) {
		Iterator<String> it  = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.hasNext());
	}

}
