package com;
import java.util.Scanner;

public class UtilInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter int value");
		Scanner scanner=new Scanner(System.in);
     int a=scanner.nextInt();
     System.out.println("Enter float value");
     float f=scanner.nextFloat();
     System.out.println("Enter double value");
     double d=scanner.nextDouble();
     System.out.println("the value of int :"+a);
     System.out.println("the value of float :"+f);
     System.out.println("the value of double :"+d);


	}

}
