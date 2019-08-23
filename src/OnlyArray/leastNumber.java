/*
 * Least number by substracting subsequent numbers
 * 
 */
package OnlyArray;
import java.util.*;
import java.math.*;
public class leastNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("SIZE:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int res = least(arr);
		System.out.println(res);
	}

	private static int least(int[] arr) {
		int num = 0;
		int sum = 0;
		int sumRes = 0;
		for(int i=0;i<arr.length-1;i++)
		{
			 num = arr[i]-arr[i+1];
			 num = Math.abs(num);
			 
			 sum = sum+num;
			 
			 if(sum > 9)
			 {
				 int temp = sum % 10;
				 sum = sum/10;
				 
				 //sumRes = 0;
				 sumRes = temp - sum;
				 sumRes = Math.abs(sumRes);
				 //return sumRes;
			 }
	
			 /*
			 if(sum > 99)
			 {
				 int temp = 0;
				 while(sum !=0)
				 {
				  temp= sum % 10;
				 sum = sum/100;
				 }
				 int sumRes = 0;
				 sumRes = temp - sum;
				 sumRes = Math.abs(sumRes);
			 }
			 */
			 
		}
		return sum;
	}

}
