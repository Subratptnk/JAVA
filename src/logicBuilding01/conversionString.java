/*
 * Given a string, convert it into its number form .

A or a -> 1
B or b -> 2
C or c -> 3
. . .
Z or z -> 26
space -> $
Input:

test cases, t
string , s
Output:

Desired O/p

Constraints: string length <=200
 */
package logicBuilding01;
import java.util.*;
public class conversionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter testcases");
		int t = sc.nextInt();
		
		while(t > 0)
		{
			String in = sc.nextLine();
			convert(in);
			System.out.println();
			
			
		}
		t--;
		
		 
	}

	private static void convert(String in) {
		for(int i = 0 ; i<in.length();i++)
		{
			char temp = in.charAt(i);
			int ans = changetoNum(temp);
			if(ans == 0)
				System.out.print("$");
			System.out.print(ans);
		}
		
		
		
	}

	private static int changetoNum(char ch) {
		if(ch>=65 && ch<=90)
			return ch-64;
		if(ch>=97 && ch<=122)
			return ch-96;
		return 0;
	}

}
