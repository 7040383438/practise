package com;
import java.util.Scanner;

public class QuantityPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter quantity and price value");
		int qty=scanner.nextInt();
		//System.out.println("Enter price");
	  float price=scanner.nextFloat();
		float totalexp=qty*price;
		//int totalexp=scanner.nextInt();
			//totalexp=qty*price;
		System.out.println("Total expence"+totalexp);
        float discount;
		if(totalexp>5000)
		{
			discount=(totalexp*0.1f);
			//totalexp=totalexp-discount;
			System.out.println("congras you have got discount:"+discount);
			System.out.println("Totl payble amount is "+(totalexp-discount));
		}
		else
		{
			
		System.out.println("Opps you don't eligible for  discount");
		System.out.println("Total exp is "+totalexp);
	}
	}
}
