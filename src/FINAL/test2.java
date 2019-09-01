/*
 * A string is said to be a child of a another string if it can be formed by deleting 0 or more characters from
the other string. Given two strings of equal length, what's the longest string that can be constructed such
that it is a child of both?
 */

package FINAL;
import java.util.*;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Strings respectively");
		String str1 = sc.next();
		String str2 = sc.next();
		
		int res = commonChild(str1,str2);
		System.out.println("result: "+res);
	}

	private static int commonChild(String str1, String str2) {
		//longest sequence
		int lcs[][] = new int[str1.length()+1][str2.length()+1];
		for(int i=0;i<=str1.length();i++)
		{
			for(int j = 0;j<=str2.length();j++)
			{
				if(i==0 || j==0)
				{
					lcs[i][j] = 0;
				}
				else if(str1.charAt(i-1) == str2.charAt(j-1))
					lcs[i][j] = lcs[i-1][j-1]+1;
				else
					lcs[i][j] = Math.max(lcs[i-1][j],lcs[i][j-1] );
			}
		}
		
		for(int i=0;i<str1.length();i++)
		{
			for(int j=0;j<str2.length();j++)
				System.out.print(lcs[i][j]);
			System.out.println(" ");
		}
			
		
		
		return lcs[str1.length()][str2.length()];
	}

}
