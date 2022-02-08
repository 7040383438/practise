package com;

public class CallingMemberdiffclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Demo demo=new Demo(); //object
   System.out.println(demo.a);
   demo.display();
   CallingMemberdiffclass cms=new CallingMemberdiffclass();
   cms.show();
		System.out.println(Demo.f);
  Demo.show();
	}
	void show()
	{
		Demo demo=new Demo();
		System.out.println(demo.a);
		demo.display();
		System.out.println(Demo.f);//static to non static different class
	Demo.show();
}
}

class Demo
{
	static int f=40;
	int a=10;
	void display()
	{
		System.out.println("Hello");
	}
		static void show()
		{
			System.out.println("world");
		}
	
}
