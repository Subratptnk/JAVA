/*
 * approach: Iterate over the ups and downs keeping track of 
your distance from sea level and whenever you make
the transition to below increase a value and repeat
that for each time you make the transition
 */
package FINAL;
import java.util.*;
public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of steps taken");
		int n = sc.nextInt();
		System.out.println("Enter the pattern ");
		String moves = sc.next();
		
		int level = 0;
		int valleys = 0;
		boolean belowSea = false;
		
		for(int i=0;i<n;i++)
		{
			char slope = moves.charAt(i);
			if(slope == 'U')
				level++;
			else
				level--;
			
			if(!belowSea && level < 0)
			{
				valleys++;
				belowSea = true;
			}
			
			if(level>=0)
				belowSea = false;
				
					
		}
		System.out.println(valleys);
	}

}
