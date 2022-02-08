package com;
import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//float basic_salary, 
float gross_salary, HRA = 0, DA = 0;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter basic salary of Employee : ");
float basic_salary=scanner.nextFloat();
//float gross_salary=scanner.nextFloat();
//float HRA=scanner.nextFloat();
//float DA=scanner.nextFloat();

if ((basic_salary<1500) && (basic_salary>=0))
{
 HRA=(float) (0.1*basic_salary);
 DA=(float) (0.9*basic_salary);
}

else if(basic_salary>=1500)
{ 
 HRA=500;
 DA=(float) (0.98*basic_salary);
}
else
{
	System.out.println("Invalid please enter again");
}
gross_salary=basic_salary+HRA+DA;
System.out.println("Gross salary is : "+gross_salary);
	}
}

