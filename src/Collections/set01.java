/*
 *  Develop a java class with a instance variable H1 (HashSet)  add a method saveCountryNames(String CountryName) , the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null. 
NOTE: You can test the methods using a main method.
 */
package Collections;
import java.util.*;
public class set01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country obj = new Country();
		obj.saveCountryNames("India");
		obj.saveCountryNames("USA");
		obj.saveCountryNames("China");
		obj.saveCountryNames("Japan");
		
		System.out.println("China : "+obj.getCountry("China"));
		System.out.println("India : "+obj.getCountry("India"));
		System.out.println("United States : "+obj.getCountry("USA"));

	}

}

class Country
{
	HashSet<String> h1 = new HashSet<>();
	
	HashSet<String> saveCountryNames(String CountryName)
	{
		h1.add(CountryName);
		return h1;
	}
	
	String getCountry(String CountryName)
	{
		Iterator<String> it = h1.iterator();
		
		while(it.hasNext())
		{
			if(it.hasNext() == equals(CountryName));
				return CountryName;
		}
		return null;
	}
}
