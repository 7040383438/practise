package com;

public class Instancevaribale {
      int c; // allocate run time memory
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Instancevaribale ins=new Instancevaribale();
      ins.c=10;
		System.out.println("The value of intsance c variable " +ins.c);
		ins.display();
	}
       void display()
       {
    	   System.out.println("Hello !!!");
       }
}
