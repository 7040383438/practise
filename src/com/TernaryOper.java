package com;

public class TernaryOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10,b=20;
		if(a>b)
		{
			System.out.println(a+"greater");
		}
		else
		{
			System.out.println(b+ "is greater");
		}
		String str=(a>b)?a+ "is greater" : b+" is greater";
		System.out.println(str);
	}

}
