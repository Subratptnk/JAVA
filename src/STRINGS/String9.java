/*
 *  Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on. 
Any characters left, will go to the end of the result.
 */
package STRINGS;
import java.util.*;
public class String9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		StringBuilder op = new StringBuilder();
		for(int i = 0;i<str1.length()||i<str2.length();i++)
		{
			if(i<str1.length())
				op.append(str1.charAt(i));
			if(i<str2.length())
				op.append(str2.charAt(i));
		}
		System.out.println(op.toString());
	}

}
