/*
Steve has a string of lowercase characters in range ascii[‘a’..’z’]. He wants to reduce the string to its shortest length by doing a series of operations. In each operation he selects a pair of adjacent lowercase letters that match, and he deletes them. For instance, the string aab could be shortened to b in one operation.
Steve’s task is to delete as many characters as possible using this method and print the resulting string. If the final string is empty, print Empty String

Function Description

Complete the superReducedString function in the editor below. It should return the super reduced string or Empty String if the final string is empty.
superReducedString has the following parameter(s):

s: a string to reduce
Input Format

A single string, .

Constraints

Output Format

If the final string is empty, print Empty String; otherwise, print the final non-reducible string.

Sample Input 

aaabccddd

Sample Output 

abd

 */
package logicBuilder2;
import java.util.*;
public class StringReduced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		
		sc.close();
		while(true)
		{
			int len = str.length();
			str = str.replaceAll("(.)\\1", "");
			
			if(str.length() == len)
			{
				break;
			}
				
		}
		if(str.isEmpty())
			System.out.println("Empty String");
		else
			System.out.println(str);
	}

}

