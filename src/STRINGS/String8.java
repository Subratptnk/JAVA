/*
 *  Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *
 */
package STRINGS;
import java.util.*;
public class String8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		if(str.contains("*"))
		{
			int in =str.indexOf("*");
			String str1 = (String) str.subSequence(0, in-1);
			String str2 = (String) str.subSequence(in+2, str.length());
			System.out.println(str1+str2);
		}
		else
		{
			System.out.println(str);
		}
	}

}
