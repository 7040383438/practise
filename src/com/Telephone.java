package com;
import java.util.Scanner;
public class Telephone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner telephone = new Scanner(System.in);
		System.out.println("Mention the calls");
		double calls = telephone.nextDouble();

		if((calls>=100) && (calls<=100)) {

		double telephoneBill = 200;
		System.out.println("Telephone Bill is " + telephoneBill);
		}

		else if((calls>100) &&(calls<=150))
		{
		 double call = calls-100;
		 double telephoneBill = 200+(call*0.60);
		System.out.println("Telephone Bill is " + telephoneBill);
		}

		else if((calls>150) && (calls<=200))
		{
		double call = calls-150;
		 double telephoneBill = 200 + (50*0.60) + (call*0.50);
		System.out.println("Telephone Bill is " + telephoneBill);
		}

		else if(calls>200)
		{
		double call = calls-200;
		double telephoneBill = 200 + (50*0.60) + (50*0.50) + (call*0.40);
		System.out.println("Telephone Bill is :" +telephoneBill);
		}
		else
		{
			System.out.println("IVALID pleas enter again");
		}
		

		

	}

}