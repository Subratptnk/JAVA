/*
 * How to find duplicate characters in a String?
 */
package logicBuilding01;
import java.util.*;
public class p05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		int count = 0;
		char arr[] = str.toCharArray();
		System.out.println("Duplicate are ");
		for(int i=0; i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[j]);
					count++;
					break;
				}
			}
		}
	}
}
