/*
 * Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.
 */
package STRINGS;
import java.util.*;
public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		String op= "";
		if(n<2)
			op = str;
		else
		{
			for(int i=0;i<n;i++)
				op = op+str.charAt(0)+str.charAt(1);
		}
		System.out.println(op);
		
	}

}
