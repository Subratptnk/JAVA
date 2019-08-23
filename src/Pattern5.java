
import java.util.*;
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Height: ");
		int n = sc.nextInt();
		int k = 0;
		for(int i = 1; i <= n; ++i, k = 0) {
            for(int space = 1; space <= n - i; ++space) {
                System.out.print("  ");
            }
            while(k != 2 * i - 1) {
                System.out.print(" *");
                ++k;
            }
            System.out.println();
		}
		
	}

}

/*
 
 OUTPUT:
 
 Height: 
5
         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *

*/