/*
 * approcah: Since we only care about the number of pairs, we can iterate over the
		  input and check if we have already seen a matching sock. To do this, 
		  once we see a new sock we store it in a hash map with the value 1 and
		  if we see that sock a again we simply set its' value to 0 and increase
		  our pair count by 1. After iterating all the socks we will have a total
		  number of pairs.
 */
package FINAL;
import java.util.*;
public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		
		HashMap inventory = new HashMap<Integer,Integer>();
		
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			int color = sc.nextInt();
			
			if(inventory.containsKey(color)&& inventory.get(color).equals(new Integer(1)))
			{
				inventory.put(color, 0);
				count++;
				continue;
			}
			inventory.put(color,1);
			
		}
		System.out.println(count);
		
	}

}
