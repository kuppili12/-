package javaEssentials;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// case 1 - Example
		
		/*double price = 49.99;
				if (price > 100) {
					System.out.println("Discount 20% Eligible");
				}
				else if (price > 50 & price < 100) {
					System.out.println("Discount 20% Eligible");
				}
				else if (price >10 & price <50) {
					System.out.println("Discount 10% Eligible");
				}
				else {
					System.out.println("Minimum $10 purchase needed for discount");
				}*/

		// case 2 - example
		
		/*boolean isVipUser = true;
		boolean electronicitem = true;

		if(isVipUser && electronicitem ) 
		{
		System.out.println("Apply 50% dISCOUNT + AND condidtion satisfied here for VIPUser / Elect");
		}

		//boolean isVipUser1 = true;
		//boolean electronicitem1 = false;

		else if (isVipUser || electronicitem) 
		{
		System.out.println("Apply 20% discount");
		}
		else 
		{
		System.out.println("Please signup for VIP User to get discount");
		}*/
		
		// case 3 - Example
		
		/*int a = 10;
		int b = 20;

		System.out.println("is a equal to b?" + (a==b));
		System.out.println("is a not equal to b?" + (a!=b));
		System.out.println("is a greater than b?" + (a>b));
		System.out.println("is a lesser than b?" + (a<b));
		System.out.println("is a greater than equal to b?" + (a>=b));
		System.out.println("is a lesser than equal to b?" + (a<=b));*/
		
		// case - 4 Example
		
		/*int x = 10;
		int y = 3;
		System.out.println("X+Y :" + (x+y));
		System.out.println("X-Y :" + (x-y));
		System.out.println("X*Y :" + (x*y));
		System.out.println("X/Y :" + (x/y)); 
		System.out.println("X%Y :" + (x%y)); // modulus % - is a reminder 10/3=3 and reminder is 1
		 */		
		
		// case - 5 Example
		
		/*int num1 = 10;
		int num2 = 20;
		System.out.println("num1+num2 = num1 --> value as num2 is added and memory is assigned with num1 updated value :  " + (num1 += num2));
		System.out.println("num1+=num2 : value of num1 is now 30 and num2 is 20  :   				 					  " + (num1 += num2));
		System.out.println("num1-=num2 : value of num1 is now 50 and num2 is 20  :   									  " + (num1 -= num2));
		System.out.println("num1*=num2 : value of num1 is now 30 and num2 is 20  :   									  " + (num1 *= num2));
		System.out.println("num1/=num2 : value of num1 is now 600 and num2 is 20 :  									  " + (num1 /= num2));
		System.out.println("num1%=num2 : value of num1 is now 30 and num2 is 20  and reminder is 10 :   				  " + (num1 %= num2));*/ 
		
		//case - 6 Example
		/*int num1 = 10;
		System.out.println("num1++num2 :" + (num1++));
		System.out.println("num1+num2 added +1 to 10 :" + (num1));
		System.out.println("num1+num2 value 11 adding +1 :     " + (num1++));
		System.out.println("num1+num2 display added value 12 :  " + (num1));
		System.out.println("num1--num2 value 12 will decrease :    " + (num1--));
		System.out.println("num1-num2 value decreased by 1 now 11:   " + (num1));*/
		
		// Case - 7 Example WHILE LOOP
		/*int i = 1;
		while (i < 11) {
			System.out.println(i);
			i++;
		}
		System.out.println("Coming out of while loop");*/
		
		// Case - 8 Example FOR LOOP
		/*for(int i=1; i<=10; i++){
			System.out.println(i);
		}	*/
		
		// Case - 9 Example FOR LOOP
		/*for(int i=10; i<=100; i=i+10){
			System.out.println(i);*/
		//}	
		
		// Case - 10 Example FOR LOOP
		/*for(int i=10; i>=0; i--){
			System.out.println(i);
		}	
		System.out.println("Coming out of loop");*/
	

		
		// Case - 9 Example FOR EACH LOOP
		/*int sal = 1000;
		int[] empid = {10, 20, 30, 70, 80, 90};
		
		//int[] empid = {10, 20, 30};
		
		for (int id : empid) {
			
			System.out.println("Give 10% bonus for :" +id+ "=" + (sal*.10));
		}*/
		
		// Case - 10 Example to display names in array
		/*String [] ename = {"Ram", "Sam", "Vijay" };
		
		for (String id : ename) {
			
			System.out.println("Employee Name  :  " + id);
		}*/
		/* int sal = 1000;
		int[] empid = {10, 20, 30};
		for (int id : empid ) {
		System.out.println("empid :    "+id);*/
			
		// Case - 11 Example 
		
		
	}
}


		
