package com;

public class UserDefineMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  show();
 int output=add(5,6);
 System.out.println(output);
 System.out.println(add(25,52));
  UserDefineMethod usd=new UserDefineMethod();
  usd.getNumber();
	}
	static void show() //default
	{
		System.out.println("Hello Java!!!!");
	}

	static int add(int a,int b) // parameterised
	{
		//System.out.println("Hiiii");
		return(a+b);
	}
	     int getNumber()  //non-parameterised return type mothod
	     {
	    	 return 1;
	     }
}
