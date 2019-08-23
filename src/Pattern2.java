// RECTANGLE PATTERN
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = sc.nextInt();
		System.out.println("Enter the number of col");
		int col = sc.nextInt();
		
		pattern2(row,col);
	}

	private static void pattern2(int row, int col) {
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i==1 || i==row||j==1||j==col)
				{
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		
	}

}

/*
OUTPUT

Enter the number of rows
3
Enter the number of col
5
*****
*   *
*****

*/