/*
 * Hello Friends, in this tutorial we are going to learn CamelCase Hackerrank Algorithm Solution in Java.
Challenge Name: Super Reduced String
Problem:
Alice wrote a sequence of words in CamelCase as a string of letters, s, having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
 */

package logicBuilder2;
import java.util.*;
public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        System.out.println(count + 1);
	}
}
