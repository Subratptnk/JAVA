/*
 * Write a program to count a number of words in a given String.
 * The words are separated by the following characters: space (‘ ‘) or newline (‘\n’) or tab (‘\t’) or a combination of these. 
 * For example, if input "Java is great" your program should print 3.
 */
package logicBuilding01;
import java.util.*;
public class p04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = sc.nextLine();
		String arr[] = str.split("\\s");
		
		System.out.println(arr.length);
		
		
		 
	}
}
