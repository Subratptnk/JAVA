/*
 * Marut loves good strings. According to him, good strings are those which contain either all alphabets of uppercase or lowercase. While he is preparing for his exams, he finds many bad strings in his book and wants to convert them to good strings. But he wants to do this in minimum number of operations.
In one operation, he can pick only one character of any case and convert it to any other case.

As his exams are going on, he wants your help.

Input:
The first line contains an integer T, denoting the number of test cases.
Each test case consists of only one line with a string S which contains uppercase and lowercase alphabets..

Output:
Print the minimum number of operations, in which Marut can obtain a good string.
Print the answer for each test case in new line.

Constraints:
1 ≤ T ≤ 10
If T is not in this range, print "Invalid Test" (without the quotes)
1 ≤ Length of S ≤ 100
S can contain numbers, special characters but no spaces.
If the length of string is not in the above range or it does not contain any alphabets, print "Invalid Input" (without the quotes)

For Example, if the input is:
0
TestString

Print "Invalid Test" (without the quotes)
 */
package logicBuilding01;
import java.util.*;
public class marutString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.next();
		String ans = check(str);
		System.out.println(ans);
	}

	private static String check(String str) {
		int l = 0 , h = 0;
		if(str.length()>100)
			return"Invalid Test";
		for(int i=0;i <str.length();i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
				h++;
			if(str.charAt(i)>=97 && str.charAt(i)<=122)
				l++;
		}
		if(h==0 && l == 0)
			return "Invalid Test";
		else
			return Integer.toString(Math.min(l, h));
		
	}

}
