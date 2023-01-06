package MethodOverriding;

public abstract class Test 
{
	abstract void a();//Abstract method must be overrided where Abstract class extended
	public void b()
	{
		System.out.println("Simple method from Abstract class called");
	}
	final void d()
	{
		System.out.println("final method in Test Abstract class");
	}
}
class Test1 extends Test
{

	@Override
	void a() {
		System.out.println("Abstract method overrided from abstract class Test");
		
	}
	public static void c()//static method can not override
	{
		System.out.println("static method called");
	}
//	public void d() //final method can not overrided
//	{
//		// TODO Auto-generated method stub
//
//	}
	
	final void e()//final method can not override anywhere
	{
		System.out.println("final method in test1 class");
	}
}

class Test2 extends Test1
{
	@Override
	void a() {
		System.out.println("overriden method from Test to Test2");
	}
//	 void e() //can not override final method
//	{
//		// TODO Auto-generated method stub
//
//	}
	
}