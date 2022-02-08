package com;

import java.util.Scanner;

public class InitializeStringAndChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string initialise
		Scanner scanner=new Scanner(System.in);
		//System.out.println("Enter your name");
		//String name=scanner.next();
		//String name=scanner.nextLine();
		//System.out.println("the name is :"+name);
		//character initialise 
		System.out.println("Enter a character");
     String str=scanner.next();
     char ch=str.charAt(2);
     System.out.println("the word is : "+str);
     System.out.println("the character is :"+ch);
	}

}
