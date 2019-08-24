/*
 * Find all the elements in array which have atleast 2 greater elemnets
 */
package OnlyArray;
import java.util.*;
public class atleastGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Size: ");
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i = 0 ; i < n ;i++)
		{
			arr[i]= sc.nextInt();
		}
		findNumber(arr);
	}

	private static void findNumber(int[] arr) {
		// TODO Auto-generated method stub
		for(int i =0 ;i <arr.length ; i++)
		{
			int count = 0;
			for(int j = 0;j<arr.length;j++)
				if(arr[j] >arr[i])
					count++;
			if(count>=2)
				System.out.println("The numbers are: "+arr[i]);
		}
	}

}
