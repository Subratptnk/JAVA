/*
 * Finding the sum of all numbers
 */
package OnlyArray;
import java.util.*;
public class sumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("SIZE:");
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int res =  findSum(arr);
		System.out.println(res);
	}

	private static int findSum(int[] arr) {
		
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		
		return sum;
		
		
	}

}
