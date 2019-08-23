/*
 * Simple sorting 
 */
package OnlyArray;
import java.lang.reflect.Array;
import java.util.*;

public class simpleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("size:");
		int n = sc.nextInt();
		int arr[] = new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		for(int i =0 ;i<n;i++)
			System.out.println(arr[i]);
		
	}
	


}
