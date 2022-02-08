package com;

public class Memberwithinclass {
    int a=20;
    static int c=90;
    static void call()
    {
    	System.out.println("Hello");
    }
    void show()
    {
    System.out.println("Welcome");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memberwithinclass cm=new Memberwithinclass();
		cm.show();
		cm.display();
		System.out.println(cm.a);
       System.out.println(c);
		call();
	}
	 void display()
	 {
		 System.out.println(a);
		 System.out.println(c);
		 show();
		 call();
	 }

}
