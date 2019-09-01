/*
You are given a string containing characters  and  only. Your task is to change it into a string such that there are no matching adjacent characters.
To do this, you are allowed to delete zero or more characters in the string.
Your task is to find the minimum number of required deletions.
*/



package FINAL;
import java.util.*;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		
		System.out.println("total number of delete are: ");
		int del = checkAlter(str);
		System.out.println("delete  are :" +del);
	}

	private static int checkAlter(String str) {
		char a[] = new char[str.length()];
		int del=0;
		char arr[] = str.toCharArray();
		for(int i=0;i<arr.length-1;i++)
		{
			a[0] = arr[0];
			if(arr[i] == arr[i+1])
			{
				del++;
			}
			else
			{
				a[i] = arr[i];
			}
		}
		
		return del;
		
	}

}
