/*
 * To find out 3 largest element in an array
 */
package OnlyArray;
import java.util.*;
public class Three_LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("SIZE:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		print3Largest(arr);
	}

	private static void print3Largest(int[] arr) {
		int i,first,second,third;
		
		if(arr.length < 3)
		{
			System.out.println("Invalid number");
			return;
		}
		third = first = second = Integer.MIN_VALUE;
		
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j] > first)
			{
				third = second;
				second = first;
				first = arr[j];
			}
			else if (arr[j] > second)
			{
				third = second;
				second = arr[j];
			}
			else if (arr[j] > third)
			{
				third = arr[j];
			}
			
			//System.out.println("The 3 largest numbers are : "+ first+" "+second+" "+third);
				
		}
		System.out.println("The 3 largest numbers are : "+ first+" "+second+" "+third);
		
		
	}

}
