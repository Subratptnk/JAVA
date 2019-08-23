/*
 *  Write a java program that accepts a string and returns a new string without the first and last character of the input string.
 */
package STRINGS;
import java.util.*;
public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		String op = "";
		System.out.println(str.subSequence(1, n-1));
	}

}
