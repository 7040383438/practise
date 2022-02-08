package com;
import java.util.Scanner;	
import java.lang.*;

public class Absolute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in = new Scanner(System.in); 
			  System.out.println("AbsoluteValue");
			  //System.out.println("-----------------------------");
			  //System.out.print("Enter float number: ");
			  int num= in.nextInt();
			  if(num<0)
			  {
			  System.out.println("Absolute numeric to given numeric "+num+ "is"+(-num));
			  
			  }else
			  {
			
				  System.out.println("Absolute numeric to given numeric "+num+ "is"+(num));
			  }
		
	
	}
}
