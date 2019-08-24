/*
 *  Create an ArrayList that can store only numbers like int,float,double,etc, but not any other data type.
 */
package Collections;
import java.util.*;
public class list04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list = new ArrayList<>();
		
		try {
			list.add(15);
			list.add(1.2F);
			list.add(3.1416D);
			list.add("test");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(list);
	}
	
	

}
