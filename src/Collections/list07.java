/*
 *  Write a program that will have a Vector which is capable of storing Employee objects. Use an Iterator and enumeration to list all the elements of the Vector.
 */
package Collections;
import java.util.*;
public class list07 {

	public static void main(String[] args) {
		Vector<Employee1> list = new Vector<>();
		
		list.add(new Employee1(101, "Bob", "123 street, India", 20000.0));
		list.add(new Employee1(101, "Bob", "123 street, India", 20000.0));
		list.add(new Employee1(101, "Bob", "123 street, India", 20000.0));
		list.add(new Employee1(101, "Bob", "123 street, India", 20000.0));
		
		Iterator<Employee1> it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.hasNext());
	}
	

}

class Employee1 {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee1(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}
