package javaEssentials;

public class EmployeeClass_CalledClass {

	public static void main(String[] args) {
		System.out.println("*******************************emp1********************************");
		EmployeeClass_CallingClass emp1;
		emp1 = new EmployeeClass_CallingClass();
		emp1.name ="Ram";
		emp1.emplid = 001;
		emp1.salary = 10000;
		emp1.dept = "QA";
		
		emp1.printEmployeeDetails();
		
		System.out.println("*******************************emp2********************************");
		EmployeeClass_CallingClass emp2;
		emp2 = new EmployeeClass_CallingClass();
		emp2.name ="Arun";
		emp2.emplid = 002;
		emp2.salary = 20000;
		emp2.dept = "QA";
		
		emp2.printEmployeeDetails();
		
		System.out.println("*******************************emp3********************************");
		EmployeeClass_CallingClass emp3;
		emp3 = new EmployeeClass_CallingClass();
		emp3.name ="Vijay";
		emp3.emplid = 003;
		emp3.salary = 15000;
		emp3.dept = "QA";
		
		emp3.printEmployeeDetails();
		
	}

}
