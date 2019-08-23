package Araay_String;
import java.util.*;
public class main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int res = FindStringCode(str);
		System.out.println(res);

	}

	private static int FindStringCode(String input1) {
		String arr[] = input1.split(" ");
		StringBuffer op = new StringBuffer();
		
		
		for(String str:arr)
		{
			str=str.toUpperCase();
			System.out.println(str);
			int sum=0;
			for(int i=0 ; i < (str.length() / 2) ; i++)
			{
				int j = str.length() - i -1 ;
				int large;
				int small;
				
				if( change(str.charAt(i)) > change(str.charAt(j)))
				{
					large = change(str.charAt(i));
					small = change(str.charAt(j));
				//	System.out.println(large+" "+small);
				}
				else
				{
					large = change(str.charAt(j));
					small = change(str.charAt(i));
				}	
				sum += large-small;
			}
			if(str.length() % 2 == 1)
			{
				sum+= change(str.charAt(str.length()/2));
			}
			op.append(sum);
			
		}
		return Integer.parseInt(op.toString());
	
	}

	private static int change(char ch) {
		// TODO Auto-generated method stub
		if(ch >= 65 && ch <= 90)
			return ch-64;
		if(ch >=97 && ch<= 122)
			return ch-96;
		return 0;
	}

}
