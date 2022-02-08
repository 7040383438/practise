package com;

public class Variable {
     int c;
     static int d;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a; //declare
      a=10; //initialise
	//int b=20; 
	System.out.println(a);
	System.out.println("the value of a variabale is "+a); //concatination
	d=50;
	System.out.println("the value of d  variable is "+d);
    show();
	}
	
static void show()
	{
		d=60;
		System.out.println("the value of d  variable is "+d);
	}

}
