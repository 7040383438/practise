package com;
import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //int a=10,b=20,c=-8;
  //int result=(a++)+(++b)+(--c)+(++a)+(b--)+(++c);
  //System.out.println(result);
  //even odd
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a value :");
		int num1=scanner.nextInt();
		if(num1%2==0)
		{
			System.out.println(num1+"is even");
		}
		else
		{
			System.out.println(num1+"is odd");
		}
	
	}

}
//current value
// a 10 b 20 c -8
// update
//a=11 ,12
//b=21 20
//c--9 --8
//exp :10+21-9+12+21-8
