package com;
import java.util.Scanner;
public class ProftLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
     	System.out.println("Enter the Costprice ");
     	double cp=scanner.nextDouble();
	System.out.println("Enter the Selling price:");
     	double sp=scanner.nextDouble();

	if(cp-sp>0)
            {
	  System.out.println("loss:" +(cp-sp));
	}
	else if(cp-sp<0)
            {
	  System.out.println("profit:" +(sp-cp));
	}
	else
	
	  System.out.println("NEUTRAL");
      

	}

}
/*
 * va.util.Scanner;
public class ProfitAndLoss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sp");
		int sp = sc.nextInt();
		System.out.println("Enter cp");
		int cp = sc.nextInt();
		if(sp>cp)
		{
			int pro = sp - cp;
			System.out.println("profit is"+pro);
		}
		else
		{
			int loss = cp - sp;
			System.out.println("loss is "+loss);
		}
	
	}

}

 * 
 * 
 * 
 * 
 *
 * 
 * */

