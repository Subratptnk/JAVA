/*
 * Find a single digit code for a String 
 */
package Araay_String;
import java.util.*;
public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		int res = ToFindCode(str);
		System.out.println("The code for String is " +res);
	}

	private static int ToFindCode(String input) {
		//char arr[] = input.toCharArray();
		//input = input.toLowerCase();
		int num,sum=0,temp;
		for(int i=0;i<= input.length();i++)
		{
			System.out.println(input.charAt(i));
			 num = FindASCCI(input.charAt(i));
			System.out.println(num);
			
			if(num > 10)
			{
				num = num % 10;
				sum = sum+num;
			}
			if(sum > 10)
			{
				sum = sum%10;
				return sum;
			}
		
		}
		
		return sum;
		
	}

	private static int FindASCCI(char c) {
			
			return (int)c;
			
		
	}

}
