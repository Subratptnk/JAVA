/*
 *  Implement the assignment 1 using Linked List
 */
package Collections;
import java.util.*;
public class list05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> arr1 = new LinkedList<String>();
		
		for(int i= 1 ;i <=5 ;i++)
		{
			System.out.println("Enter the name of the month");
			arr1.add(sc.next());
		}
		
		LinkedList<String> arr2 = new LinkedList<String>();
		
		arr2.addAll(arr1);
		System.out.println("Months: ");
		for(String i : arr2)
		{
			System.out.println(i);
		}
		
	
		
	}

	}


