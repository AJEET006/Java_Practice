package overriding;

public class Main {
	public static void main(String [] args)
	{
		//run time binding
		//run time polymorphism
		//Overriding
		//a method having different forms
		
		School obj = new Electrical();
		obj.student();
		obj=new Mechanical();
		obj.student();
		obj=new Civil();
		obj.student();
	}
}
