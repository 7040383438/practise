package com;

import java.util.Scanner;
public class UserdeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub0
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two values");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		
		//call the method
		System.out.println("The value of num1 "+num1);
		System.out.println("The value of num1 "+num1);
		UserdeMethod usd=new UserdeMethod();
		int result =usd.add(num1, num2);
		System.out.println(result);

	}
	int add(int a,int b)
	{
		return(a+b);
	}

}
