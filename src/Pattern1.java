/*
 * RECTANGLE PATTERN
 * 
*/
import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 0f rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number 0f Colums");
		int col = sc.nextInt();
		
		pattern1(rows,col);
		
	}

	private static void pattern1(int n, int m) {
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<m;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

/*
OUTPUT

Enter the number 0f rows
3
Enter the number 0f Colums
5
****
****

*/