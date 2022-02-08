package com;
import java.util.Scanner;
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value");
     int num=scanner.nextInt();
     
	
	if(num%2==0)
	{ 
		System.out.println("number is even");
		
		
	}
	else
	{
		System.out.println("number is odd");
	}

}
}
