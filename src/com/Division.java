package com;
import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
		 int marks[] = new int[6];
	        int i;
	        float total=0, avg;
	        Scanner scanner = new Scanner(System.in);
			
	        
	        for(i=0; i<5; i++) { 
	           System.out.print("Enter Marks of Subject"+(i+1)+":");
	           marks[i] = scanner.nextInt();
	           total = total + marks[i];
	        }
	        scanner.close();
	        //Calculating average here
	        avg = total/5;
	        System.out.print("The student Division is: ");
	        if(avg>=60)
	        {
	            System.out.print("A");
	        }
	        else if(avg>=59 && avg<50)
	        {
	           System.out.print("B");
	        } 
	        else if(avg>=40 && avg<49)
	        {
	            System.out.print("C");
	        }
	        else
	        {
	            System.out.print("Fail");
	        }

	}

}
