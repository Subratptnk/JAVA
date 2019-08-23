/*
 * find the largest number
 */
package OnlyArray;
import java.util.*;
public class largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("SIZE:");
		int n = sc.nextInt();
		int arr[] = new int [n];
		for(int i = 0 ; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		findMax(arr);
		findMaxSorted(arr);
	}

	private static void findMaxSorted(int[] arr) {
		Arrays.sort(arr);
		
		System.out.println("Max elemnet is :"+arr[arr.length-1]);
		
	}

	private static void findMax(int[] arr) {
		int max = 0;
		
		for(int i = 0; i<arr.length ;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println(max);
		
	}

}
