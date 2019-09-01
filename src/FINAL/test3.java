/*
 * Alice is taking a cryptography class and finding anagrams to be very useful. We consider two strings to be
anagrams of each other if the first string's letters can be rearranged to form the second string. In other
words, both strings must contain the same exact letters in the same exact frequency For example, bacdc
and dcbac are anagrams, but bacdc and dcbad are not.
Alice decides on an encryption scheme involving two large strings where encryption is dependent on the
minimum number of character deletions required to make the two strings anagrams. Can you help her
find this number?
Given two strings, and , that may or may not be of the same length, determine the minimum number
of character deletions required to make and anagrams. Any characters can be deleted from either of
the strings.
 */
package FINAL;
import java.util.*;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str1 = sc.next();
		System.out.println("Enter the String 2: ");
		String str2  = sc.next();
		
		int res = makeAnagram(str1,str2);
		System.out.println("Result: "+res);
	}

	public static int makeAnagram(String str1, String str2) {
		int[] freqFirst = new int[26];
		int[] freqSecond = new int[26];
		int deletions = 0;

		for(int i = 0; i < str1.length(); i++)
		    freqFirst[str1.charAt(i)-'a'] = freqFirst[str1.charAt(i)-'a'] + 1; //Increment frequency of char at i
		
		for(int i = 0; i < str2.length(); i++)
		    freqSecond[str2.charAt(i)-'a'] = freqSecond[str2.charAt(i)-'a'] + 1; //Increment frequency of char at i

		for(int i = 0; i < 26; i++)
		    deletions += Math.abs(freqFirst[i] - freqSecond[i]); //Track the total deletions needed

		return deletions;
		}	

}
/*

*/