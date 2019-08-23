/*
 *  Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive.
 */
package STRINGS;
import java.util.*;
public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ;i++)
		{
			System.out.print(str.substring(str.length()-n,str.length()));
		}
		
		
	}

}
