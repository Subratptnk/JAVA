/*
 * Implement the assignment 1 using Vector
 */
package Collections;
import java.util.*;
public class list06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		
		Vector<String> arr1 = new Vector();
		
		for(int i= 1 ;i <=5 ;i++)
		{
			System.out.println("Enter the name of the month");
			arr1.add(sc.next());
		}
		
		Vector<String> arr2 = new Vector();
		
		arr2.addAll(arr1);
		System.out.println("Months: ");
		for(String i : arr2)
		{
			System.out.println(i);
		}
		
	}

}
