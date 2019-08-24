/*
 * Implement the assignment 1 using TreeSet
 */
package Collections;
import java.util.*;
public class set04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country1 countries = new Country1();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Pakistan");
		countries.saveCountryNames("Bangladesh");
		countries.saveCountryNames("China");

		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("Japan: " + countries.getCountry("Japan"));
	}

	}

class Country1 {
	TreeSet<String> H1 = new TreeSet<>();
	//HashSet<String> H1 = new HashSet<>();
	
	public TreeSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		
		return null;
	}
}