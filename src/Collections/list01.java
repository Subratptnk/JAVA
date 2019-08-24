/*
 * Write a Java program to create an ArrayList, add all the months of a year and print the same
 */
package Collections;
import java.util.*;
public class list01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Size: ");
		int n = sc.nextInt();
		ArrayList<String> arr1 = new ArrayList<String>(n);
		
		for(int i= 1 ;i <=12 ;i++)
		{
			System.out.println("Enter the name of the month");
			arr1.add(sc.next());
		}
		
		ArrayList<String> arr2 = new ArrayList<String>(n);
		
		arr2.addAll(arr1);
		for(String i : arr2)
		{
			System.out.println("Months: ");
			System.out.println(i);
		}
		
	}

}
