//Inverted full PYRAMID PATTERN

import java.util.*;
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of pyramid");
		int n = sc.nextInt();
		
		pattern4(n);
		
	}

	private static void pattern4(int n) {
		// TODO Auto-generated method stub
		
		for(int i=n;i>=0;i--)
		{
			for(int j = 0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		
		
	}

}

/*
OUTPUT

Enter the height of pyramid
5

******
*****
****
***
**
*
*/