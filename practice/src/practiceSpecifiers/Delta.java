package practiceSpecifiers;

public class Delta {
	

	static void del()
	{
		System.out.println("static method of delta");
	}
	 class InnerDelta
	{ //we can declare a Inner class as static 
		public void del()
		{
			System.out.println("static method of delta");
		}
	}
}


class MainOfDelta{
	public static void main(String [] args)
	{
		Delta delta = new Delta();
		delta.del();
		practiceSpecifiers.Delta.InnerDelta inner = new Delta().new InnerDelta();
	}
}