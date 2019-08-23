/*
 *  Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged. 

If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America".
 */
package STRINGS;
import java.util.*;
public class String7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		
		if(str.charAt(str.length()-1) == str.charAt(0))
		{
			System.out.println(str);
		}
		else
		{
			System.out.println("x"+str+"x");
		}
	}

}
