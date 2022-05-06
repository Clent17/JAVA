package Hello_world1;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Input two numbers from user
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
				
		//perform arithmetic operation
		int sum = num1+num2;
		int diff = num2-num1;
		int mul = num1*num2;
		int div = num1/num2;
		int mod = num1%num2;
		//print result to console
		
		System.out.println("sum:"+sum);
		System.out.println("difference"+diff);
		System.out.println("multiply"+mul);
		System.out.println("divide"+div);
		System.out.println("modulus"+mod);

	}

}
