package javaEssentials;
public class Java_7_EmployeeClass {
	
	/* ---------------- Class --------------- */
	//These are between the braces is called class body which contains all the code for the class
	//fields to represent properties or state (Static or non-Static)
	//constructors to assign state for new objects
	//methods or functions for the behavior (Static or non-static)

	
	String name;
	int id;
	double salary;
	String dept;
	
	static int totalEmployeeCount = 0;
	
	
	/* *****Constructor******/
	public Java_7_EmployeeClass(String name, int id, double salary, String dept) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.dept = dept;
		totalEmployeeCount ++;
	}
	
	public Java_7_EmployeeClass() {
		totalEmployeeCount ++;
		
	}
	
	
	public Java_7_EmployeeClass(String name, int id) {
		this.name = name;
		this.id = id;
		this.salary = 0;
		this.dept = "TBD";
		totalEmployeeCount ++;
	}
	
	public double calculateTax () {
		
		// Do the calculation or processing here
		//Return type should be "void" if the method does not return a value
		
		//int taxPercentage = 25;
		double tax = salary * 0.25;
		return tax;
		
	}
	
	
//	public double calculateTax (int taxPercentage) {
//		
//		
//	    double tax = salary * ((double)taxPercentage/100 );
//		return tax;
//	}
	
	
	
	
	public void printDetails() {
		System.out.println("Name :" + name);
		System.out.println("ID :" + id);
		System.out.println("salary " + salary);
		System.out.println("dept : " + dept);
	}
	
	public static void printCompanyDetails() {
		System.out.println("Company Name: TrinityTechPro");
		System.out.println("Company Emp Count" + totalEmployeeCount);
	}
	
	
}