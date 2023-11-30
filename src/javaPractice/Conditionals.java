package javaPractice;

public class Conditionals {

	public static void main(String[] args) {
	
//		IF STATEMENT 
//		int salary = 50000;
//		if(salary > 40000) {
//			System.out.println("SALARY RECEIVED");
//		}
		
//		IF - ELSE STATEMENT
//		int salary = 50000;
//		if (salary < 30000) {
//			salary = salary + 2000;
//		} else {
//			salary = salary + 1000;
//		}
//		System.out.println(salary);
		
//		MULTIPLE IF - ELSE STATEMENT
		
		int salary = 10000;
		
		if (salary > 5000 ) {
			salary += 3000; // As Same as (Salary = salary + 30000)
			
		} else if (salary > 7000 ) {
			salary += 5000;
			
		} else {
			salary += 2000;
		}
		
		System.out.println(salary);
		
		
		

	}

}
