/*
 * Manish has got the task to frame a speech for his professor at the university at the Annual sports meet.But the problem is that the professor has speech dyslexia and he can't speak the words clearly which have vowels in them. So Manish has to avoid such words and has to minimise their usage in the speech letter. Your task is to help Manish mark the vowels in the words so that he can minimise their use. You are given a string S consisting of lower case letters only. You need to count the number of vowels in the string S.

INPUT The first line will contain an integer T denoting the number of test cases. The following T lines will contain a string S in lower case letters only.

OUTPUT Print the number the vowels in the string S.
 */
package logicBuilding01;
import java.util.*;
public class vowelPhobia {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the string ");
		String str = sc.next();
		
		int res = check(str);
		System.out.println(res);
	}

	private static int check(String str) {
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			char temp = str.charAt(i);
			if(temp == 'a')
				count++;
			else if(temp == 'e')
				count++;
			else if(temp == 'i')
				count++;
			else if(temp == 'o')
				count++;
			else if(temp == 'u')
				count++;
			else if(temp == 'A')
				count++;
			else if(temp == 'E')
				count++;
			else if(temp == 'I')
				count++;
			else if(temp == 'O')
				count++;
			else if(temp == 'U')
				count++;
		}
		
		return count;
	}

}
