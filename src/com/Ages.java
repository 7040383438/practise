package com;
import java.util.Scanner;


public class Ages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
	System.out.println("Enter ram age");
	int ram=scanner.nextInt();
   System.out.println("Enter sulabh age");
   int sul=scanner.nextInt();
   System.out.println("Enter ajay age");
   int ajay=scanner.nextInt();
   
	
	if(ram<sul && ram<ajay)
	{
		System.out.println("Ram is youngest among all:"+ram);
	}
		else if(sul<ram && sul<ajay)
		{
		System.out.println("Sulabh is youngest among all:"+sul);
		}
		else
			System.out.println("ajay is youngest among all:"+ajay);	
	}

}
 

