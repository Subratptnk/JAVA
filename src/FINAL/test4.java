/*
 * 
 */
package FINAL;
import java.util.*;
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		
		String res = isValid(str);
		System.out.println(res);
	}

	private static String isValid(String str) {
		
	    final String GOOD = "YES";
	    final String BAD = "NO";
		
		if(str.isEmpty())
			return BAD;
		if(str.length()<=3)
			return GOOD;
		
		int letters[] = new int [26];
		for(int i=0;i<str.length();i++)
		{
			letters[str.charAt(i)-'a']++;
		}
		
		Arrays.sort(letters);
		int i=0;
		while(letters[i] == 0)
		{
			i++;
		}
		int min = letters[i];
		int max = letters[25];
		String ret = BAD;
		if(min==max)
		{
			ret = 	GOOD;
		}
		else
		{
			
			if((((max-min == 1) && max>letters[24]))|| (min == 1) && (letters[i+1] == max))
			{
				ret = GOOD;
			}
			
		}
		
		return ret;
	}

}
