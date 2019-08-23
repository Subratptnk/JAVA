/*
 *  Write a Program to check whether a given String is Palindrome or not.
 */
package STRINGS;
import java.util.*;
;

public class String1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String temp="";
		int n = str.length();
		for(int i=n-1;i>=0;i--)
		{
			temp = temp+str.charAt(i);
		}
		if(str.equalsIgnoreCase(temp))
		{
			System.out.println("Pallindrome");
		}
		else
			System.out.println("Not pallindrome");

	}

}
