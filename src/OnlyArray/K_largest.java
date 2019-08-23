/*
 * Finding the k largest number
 */
package OnlyArray;
import java.util.*;
public class K_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Size: ");
		int n = sc.nextInt();
		Integer arr[] = new Integer[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Value of K");
		int k = sc.nextInt();
		
		 kLarge(arr , k);
		 kLargeUnsorted(arr,k);
		
	}

	private static void kLargeUnsorted(Integer[] arr, int k) {
		Arrays.sort(arr);
		
		System.out.println("Unsorted Klarge is "+arr[k-1]);
		
	}

	private static void kLarge(Integer[] arr, int k) {
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		for(int i=0;i<k;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
