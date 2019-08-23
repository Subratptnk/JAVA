/*
 *  Given two strings a and b, return a new string, following the rules given below. 
If string b occurs in string a, then the new string should concatenate the characters that appear before and after of String b.
Ignore cases where there is no character before or after the word, and a character may be included twice if it is in between two string b's.
 */
package STRINGS;
import java.util.*;
public class String11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		String op = "";
		int n = str1.indexOf(str2);
		
		op = str1.substring(n-1, str1.length()-n);
		System.out.println(op);
	}

}
