/*
 *  Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string.
 */
package STRINGS;
import java.util.*;
public class String4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n =str.length();
		if(n % 2 == 0)
		{
			System.out.println(str.subSequence(0, n/2));
		}
		else
			System.out.println("null");
	}
}
