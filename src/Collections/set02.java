/*
 *  Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using an Iterator.
 */
package Collections;
import java.util.*;
public class set02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		
		set.add("bob");
		set.add("Mack");
		set.add("Ram");
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
