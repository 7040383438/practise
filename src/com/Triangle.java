package com;
import java.util.Scanner;

public class Triangle {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter the first angle");
		 int first=scanner.nextInt();
		 System.out.println("Enter the second angle");
		 int second=scanner.nextInt();
		 System.out.println("Enter the third angle");
	     int third=scanner.nextInt();
		 // function calling and print output
	    // if (first + second < third || first + third < second || second + third < first || first + second + third >= 180)
	     if(first + second + third >= 180) 
	     System.out.print("Valid");
	        else
	            System.out.print("Invalid");
	         
	}

}
