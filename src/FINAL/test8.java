/*
 * Subrat code:					
 */
package FINAL;
import java.util.*;
public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you name which you want to code: ");
		String code = sc.nextLine();
		
		encrypy(code);
	}

	private static void encrypy(String str) {
		// TODO Auto-generated method stub
		str = str.toUpperCase();
		String words [] = str.split(" ");
		
		int sum1 = 0;
		int sum2=0;
		for(String word : words)
		{
			System.out.println(word);
			int n = word.length();
			System.out.println(n);
			
			
			for(int i=0;i<word.length();i++)
			{
				int ch = changeToNum(word.charAt(i));
				sum1+=ch;
			
				System.out.println("number:"+word.charAt(i) +"->"+ch);
			}
			int var1 =sum1%10; 
			sum1 = (sum1/10)+var1;
			System.out.println("The total sum: "+sum1);
			
		}
		sum2 += sum1;
		
		System.out.println(sum2);
		
		if(sum2<10)
			System.out.println("POOR NAME");
		else if(sum2>=10 && sum2<20)
			System.out.println("AVERAGE NAME");
		else
			System.out.println("STRONG NAME");
		
		
		
	}

	private static int changeToNum(char ch) {
		
		if(ch>=65 && ch<=90)
			return ch - 64;
		return 0;
	}

}
