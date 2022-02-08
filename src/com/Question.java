package com;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
     call();
	}

	static void call()
	{
		User.display();
	}
}
class User{
	int userId=10;
	static String courseName="JFS";
	void show()
	{
		System.out.println("Display User Info");
		
	}
	static void display()
	{ 
		User use=new User();
		System.out.println(use.userId);
		System.out.println(courseName);
	}
			
}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 



