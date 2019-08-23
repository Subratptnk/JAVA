/*
 *  Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.
 */
package STRINGS;
import java.util.*;
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		String op = "";
		int n1 = str1.length();
		int n2 = str2.length();
		if(str1.charAt(n1-1) == str2.charAt(0))
		{
			op = str1+str2.substring(1);
		}
		else
			op = str1 +" "+str2;
		
		System.out.println(op.toLowerCase());
	}

}
