package javaPractice;

import java.util.Scanner;

public class TypeConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		int num = input.nextInt();
//		System.out.println(num);
		
//		type Casting
//		int num = (int)(67.58f);
//		System.out.println(num);
		
//		automatic type promotion in expressions
//		int a = 257;      // byte can only store 256 in it if the value exceed then it gives it maximum value which is 1
//		byte b = (byte)(a);     // 257 % 256 = 1
//		System.out.println(b);
		
		
//	    byte a = 40;
//	    byte b = 50;
//	    byte c = 100;
//	    int d = a * b / c;
//	    System.out.println(d);
//		
//		byte b = 50;
//		b = b * 2;  //cannot convert from int to byte
		
//		int number = 'A';     //i gave a letter but compiler gave me a number this is known as automatic type conversion
//		System.out.println(number); // ASCII VALUE OF THIS

		
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = 0.1234;
		double result = (f * b) + (i / c) - (d - s);
//		float + int - double = double
		System.out.println((f * b) + " " +(i / c)+ " " +(d - s));
		System.out.println(result);
	}

}
