/*
 Write an efficient program to print all permutations of a given String in Java/C/Python or any programming language of your choice.
 For example, if given input is "123" then your program should print all 6 permutations e.g. "123", "132", "213", "231", "312" and "321".
 */
package logicBuilding01;
import java.util.*;
public class p01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string for checking the all permutaion : ");
		String input1 = sc.next();
		int l = 0;
		int r = input1.length()-1;
		int res = CheckPermutaion(input1,l,r);
		
	}

	private static int CheckPermutaion(String input1, int l, int r) {
		
		int count = 0;
		if(l==r)
				System.out.println(input1);	
		else
		{
			for(int i=1;i<=r ; i++)
			{
				input1 = swap(input1,l,i);
				CheckPermutaion(input1, l+1, r);
				input1 = swap(input1,l,i);
				
				
			}
		}
		return count;
		
		
		// If word is empty
		
		
	}

	private static String swap(String input1, int i, int j ) {
		char temp;
		char charArray[] = input1.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		
		return String.valueOf(charArray);
	}

}
