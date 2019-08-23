/*
 
     	   1
         1   1
       1   2   1
     1   3   3    1
   1   4   6   4   1
 1   5   10   10  5   1
 
 
 */
import java.util.*;
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Height: ");
		int n = sc.nextInt();
		int coef = 1;
		for(int i = 0; i < n; i++) {
            for(int space = 1; space < n - i; ++space) {
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    coef = 1;
                else
                    coef = coef * (i - j + 1) / j;
                System.out.printf("%4d", coef);
            }
            System.out.println();
		}
	}

}

/*
 OUTPUT: 
 Height: 
5
           1
         1   1
       1   2   1
     1   3   3   1
   1   4   6   4   1
 
 */
