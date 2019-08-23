/*

1
2 3
4 5 6
7 8 9 10
 */
import java.util.*;
public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Height:");
		int n =sc.nextInt();
		int num = 1;
		for(int i = 0; i<=n;i++)
		{
			for(int j = 1; j <=i ;j++)
			{
				System.out.print(num + " ");
				++num;
			}
			System.out.println();
		}
		
	}

}
/*
OUTPUT
 Height:
5

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/