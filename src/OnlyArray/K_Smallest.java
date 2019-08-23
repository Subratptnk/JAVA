/*
 * finding the k smallest array
 */
package OnlyArray;
import java.util.*;
public class K_Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Size: ");
		int n = sc.nextInt();
		Integer arr[] = new Integer [n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(" Value of K");
		int k = sc.nextInt();
		
		KSmall(arr , k);
		ksmallestUnsorted(arr,k);
	}

	private static void ksmallestUnsorted(Integer[] arr, int k) {
		Arrays.sort(arr);
		
		System.out.println("Unsorted KSmall is "+arr[k]);
	}
	private static void KSmall(Integer[] arr, int k) {
		
		Arrays.sort(arr);
		
		for(int i = 0 ; i<k ;i++)
		{
			System.out.println(arr[i] + " ");
		}
		
		
		
	}

}
