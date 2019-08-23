// HALF PYRAMID PATTERN

import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of pyramid");
		int n = sc.nextInt();
		
		pattern3(n);
		
	}

	private static void pattern3(int n) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=n;i++)
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

*
**
***
****
*****
******

*/