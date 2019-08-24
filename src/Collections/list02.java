/*
 1) Create an application for employee management with the following classes:

a) Create an Employee class with following attributes and behaviors :
i) int empId
ii)String empName
iii)String email
iv)String gender 
v)float salary
vi) void GetEmployeeDetails() -> prints employee details

b) Create one more class EmployeeDB with the following attributes and behaviors.
(i)ArrayList list;
ii) boolean addEmployee(Employee e)  -> adds the employee object to the collection
iii) boolean deleteEmployee(int empId)  ->delete the employee object from the collection with the given empid
iv) String showPaySlip(int empId)  -> returns the payslip of the employee with the given empId

Provide implementation for all the methods and test your program.
 */
package Collections;
import java.util.*;
public class list02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employee detail you want?");
		int n = sc.nextInt();
		for(int i = 1 ;i <= n ;i++)
		{
			Employee obj1 = new Employee();
			System.out.println("Employee number : "+i);
			obj1.GetEmployeeDetails();
		}
	

	}

}	
class Employee
{
	int empId;
	String empName;
	String email;
	String gender; 
	float salary;
	
	Employee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		empId = sc.nextInt();
		System.out.println("Enter Name");
		empName = sc.next();
		System.out.println("Enter email");
		email  = sc.next();
		System.out.println("Enter Gender");
		gender = sc.next();
		System.out.println("Enter salary");
		salary = sc.nextFloat();
	}
	
	void GetEmployeeDetails()
	{
		System.out.println("Employee ID -> "+empId);
		System.out.println("Employee name -> "+empName);
		System.out.println("Employee email-> "+email);
		System.out.println("Employee Gender -> "+gender);
		System.out.println("Employee Salary-> "+salary);
	}

	public int getEmpId() {
		return empId;
	}


	public String getEmpName() {
		return empName;
	}


	public String getEmpEmail() {
		return email;
	}


	public String getEmpGender() {
		return gender;
	}


	public float getEmpSalary() {
		return empId;
	}
}

class EmployeeDB {
	ArrayList<Employee> employeeDb = new ArrayList<>();
	
	public boolean addEmployee(Employee e) {
		return employeeDb.add(e);
	}
	
	public boolean deleteEmployee(int empId) {
		boolean isRemoved = false;
		
		Iterator<Employee> it = employeeDb.iterator();
		
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmpId() == empId) {
				isRemoved = true;
				it.remove();
			}
		}
		
		return isRemoved;
	}
	
	public String showPaySlip(int empId) {
		String paySlip = "Invalid employee id";
		
		for (Employee e : employeeDb) {
			if (e.getEmpId() == empId) {
				paySlip = "Pay slip for employee id " + empId + " is " +
						e.getEmpSalary();
			}
		}

		return paySlip;
	}
	
	public Employee[] listAll() {
		Employee[] empArray = new Employee[employeeDb.size()];
		for (int i = 0; i < employeeDb.size(); i++)
			empArray[i] = employeeDb.get(i);
		return empArray;
	}
	
}