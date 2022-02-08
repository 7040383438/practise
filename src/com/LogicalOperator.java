package com;
import java.util.Scanner;
public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Total aggregate in 10+2 :");
		Scanner scanner=new Scanner(System.in);
		double percentage=scanner.nextDouble();
		System.out.println("Enter Total aggregate in PCM :");
		double pcm=scanner.nextDouble();
		System.out.println("Total  aggregate is "+percentage);
		System.out.println("Total aggregate is  "+percentage);
		if(percentage>=90 && pcm>=92)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("not eligible");
		}

	}
}

//and operator=all condition is true
