package Araay_String;
import java.util.*;
public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int res = GetCode(input);
		System.out.println(res);
	}

	private static int GetCode(String input) {
		String arr[] = input.split(" ");
		int pin = 0;
		for(String str : arr)
		{
			pin+=str.length();
		}
		System.out.println(pin);
		if(String.valueOf(pin).length() == 1)
			return pin;
		int pin2=0;
		String pinstr = String.valueOf(pin);
		//System.out.println(pinstr);
		
		for(int i=0;i<pinstr.length();i++)
		{
			pin2 += Integer.parseInt(String.valueOf(pinstr.charAt(i)));
		}
		//System.out.println(pin2);
		return pin2;
	}

}
