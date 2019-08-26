/*
Write a Java program to check whether two strings are anagram or not?
Write an efficient program in Java/C/C++ to check if two String is an anagram of each other. An anagram contains are of the same length and contains the same character but in the different order for example "Army" and "Mary" is the anagram. Your program should return true if both Strings are the anagram, false otherwise
*/
package logicBuilding01;
import java.util.*;
public class p02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter word 1 ");
		String input1 = sc.next();
		System.out.println("Enter word 2 ");
		String input2 = sc.next();
		
		System.out.println("************Check is those words are anagram or not!***************");
		isAnagram(input1,input2);
	}

	private static void isAnagram(String input1, String input2) {
		String s1 = input1.replaceAll("\\s", "");
		String s2 = input2.replaceAll("\\s", "");
		
		boolean status = true;
		
		if(s1.length() !=s2.length())
		{
			status = false;
		}
		else
		{
			char arr1[] =s1.toLowerCase().toCharArray();
			char arr2[] = s2.toLowerCase().toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			status = Arrays.equals(arr1, arr2);
		}
		
		if(status)
		{
			System.out.println(s1 +" and "+ s2 +" are anagrams");
		}
		else
		{
			System.out.println("Not anagrams");
		}
	}

}
