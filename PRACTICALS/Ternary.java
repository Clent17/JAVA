package Clent1;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum = 0;
Scanner s = new Scanner(System.in);
System.out.println("Enter your age:");
int a=s.nextInt();
String Result =(a>=18)?"You are Eligible":"You are not Eligible";
System.out.println(Result);
}
	
}