/*
 * DECIMAL TO BINARY CONVERSION
 */
package FINAL;
import java.util.*;
public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of elements: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int jump = 0;
		
		int i=0;
		while(i< n-3)
		{
			i+=(arr[i+2] == 0)?2:1;
			jump++;
		}
		jump++;
		
		
		System.out.println(jump);
	}

}
