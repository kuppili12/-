/** Integer of SUM of Numbers
 * 
 */
/**
 * @author Owner
 *
 */
package javaEssentials;
import java.util.*;
public class IntegerSumExample1{
	public static void main(String[] args) {
		int a,b,c,d,e;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");  
        a = in.nextInt(); 
        System.out.println("Value of a :" +a);
        
        System.out.print("Enter b: ");
        b = in.nextInt();
        System.out.println("Value of b :" +b);
         
        System.out.print("Enter c: ");
        c = in.nextInt();
        System.out.println("Value of c :" +c);
        d= a+b;
        e= d+c;
        in.close();
        int price = e;
		if (price >= 100) {
			System.out.println("Discount 50% Eligible");
			System.out.println("TOTAL = " + e);
		}
		else if (price > 50 & price < 100) {
			System.out.println("Discount 30% Eligible");
			System.out.println("TOTAL  = " + e);
		}
		else {
			System.out.println("Please purchase $50 to get discount");
			System.out.println("TOTAL = " + e);
		}  
        
    }
}