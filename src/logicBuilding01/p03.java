/*
 * Write an efficient method in Java to remove all occurrence of a given character in Java.
 * For example, if given String is "Programming" and given character to remove is "m" then your function should return "Prograing".
 */
package logicBuilding01;
import java.util.*;
public class p03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.next();
		System.out.println("selct a specific character which you want to remove");
		String remv = sc.next();
		String ans = str.replaceAll(remv, "");
		System.out.println(ans);
		
	}

}
