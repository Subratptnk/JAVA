/*
 TO DRAW THIS PATTERN
 
     	1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
 
 
 */
import java.util.*;
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Height: ");
		int n = sc.nextInt();
		int k=0;
		int count=0,count1=0;
		for(int i = 1; i <= n; ++i) {
            for(int space = 1; space <= n - i; ++space) {
                System.out.print("  ");
                ++count;
            }
            while(k != 2 * i - 1) {
                if (count <= n - 1) {
                    System.out.print((i + k) + " ");
                    ++count;
                }
                else {
                    ++count1;
                    System.out.print((i + k - 2 * count1) + " ");
                }
                ++k;
            }
            count1 = count = k = 0;
            System.out.println();
        }
		
			
		}
}

/*
 OUTPUT
 
 Height: 
5
        1 
      2 3 2 
    3 4 5 4 3 
  4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5 

  
 
 */
 
