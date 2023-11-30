package javaPractice;

import java.util.Scanner;

public class JavaDemoPractice {

	public static void main(String[] args) {
		
		int FirstNum;
		int SecondNum;
		int sum;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1st Integer : ");
		FirstNum = input.nextInt();
		
		System.out.println("Enter 2nd Integer : ");
		SecondNum = input.nextInt();
		
		sum = FirstNum + SecondNum;
		System.out.println("Sum of Two Integer = "+sum);

	}

}
