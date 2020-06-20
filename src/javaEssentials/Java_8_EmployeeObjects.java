package javaEssentials;
public class Java_8_EmployeeObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Java_7_EmployeeClass emp1;
		
		emp1 = new Java_7_EmployeeClass();
		
		emp1.id = 1;
		emp1.name = "Ram";
		emp1.salary = 100000;
		emp1.dept = "QA";
		System.out.println("Emp Count:" + Java_7_EmployeeClass.totalEmployeeCount);		
		emp1.printDetails();
		
		System.out.println(emp1.calculateTax());
		
				
		System.out.println("*********");
		
		Java_7_EmployeeClass emp2 = new Java_7_EmployeeClass();
		
		emp2.id = 2;
		emp2.name = "Arun";
		emp2.salary = 200000;
		emp2.dept = "Dev";
		System.out.println("Emp Count" + Java_7_EmployeeClass.totalEmployeeCount);
		
		emp2.printDetails();
		System.out.println(emp2.calculateTax());
		
		System.out.println("****Constructor with all details****");
		
	
		Java_7_EmployeeClass emp3 = new Java_7_EmployeeClass("abc", 3, 50000, "RM" );
		System.out.println("Emp Count" + emp3.totalEmployeeCount);
		emp3.printDetails();
		System.out.println(emp3.calculateTax());
		//System.out.println(emp3.calculateTax(30));
		emp3.printCompanyDetails();
		
	
		
		
		/* **** Static vs Non-Static *********
		1) Static Variables and Static Methods
		   They are at class level and shared across all class objects.
		   we can access them by using class name.
		   
		2) Non Static Variables and Non Static Methods
		   They are at object level and they are object specific
		   We can access them by using object name only and not by class name
		
           */

	}

}