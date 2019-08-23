package Araay_String;
import java.util.*;
public class main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int res = Strength(str);
		System.out.println(res);
	}

	private static int Strength(String str) {
		int even = 0;
		int odd = 0;
		for(int i = 0;i<str.length();i++)
		{
			
			if(i % 2 == 0)
			{
				
				 int num = change_to_num(str.charAt(i));
				System.out.println(num+ "*");
				even+=num;
				
			}
			else
			{
				int num1 = change_to_num(str.charAt(i));
				
				odd+=num1;
			
			}
		}
		
		return odd+even;
	}

	private static int change_to_num(char ch) {
		if(ch >=48 && ch <= 57)
			return ch-48;
		
		return 0;
	}

}
