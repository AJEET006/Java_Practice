
public class Binding {

	public void x() {
		System.out.println("method x is called");
	}
	public void x(int i)
	{
		System.out.println("overloaded method "+i);
	}
	
}

class B extends Binding
{
	@Override
	public void x() {
		System.out.println("method x in B class");
		
	}
	
	
}
