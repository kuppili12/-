package javaEssentials;
import java.util.Scanner;
public class array {
	public static void main(String[] args) {
		String[] ename = {"Ram", "Arun", "Vijay","Jitender","Arjun"};
		double salary = 1000;
		double bonus = salary * .3;
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String fname = scan.nextLine();
        scan.close();
		boolean found = false;
		for (String element:ename) {
		    if ( element.equals( fname )) {
		        found = true;
		    }
		}
		if (found) {
		    System.out.println( "Happy Independence Day : " + fname + " You got BONUS of " + bonus);
		} else {
		    System.out.println( "The array does not contains the string : " + fname );
		}
	}
}

