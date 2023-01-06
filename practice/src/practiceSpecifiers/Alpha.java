package practiceSpecifiers;

public class Alpha {
	public void pub()
	{
		System.out.println("hello i am pubic method");
	}
	void defau()
	{
		System.out.println("Hello i'm  default method");
	}
	protected void proc()
	{
		System.out.println("i'm protected method");
	}
	@SuppressWarnings("unused")
	private void priv()
	{
		System.out.println("i'm private method");
	}
}
class alphaChild extends Alpha{
	
	@Override
	protected void proc() {
		// TODO Auto-generated method stub
		super.proc();
	}
	@Override
	void defau() {
		// TODO Auto-generated method stub
		super.defau();
	}
	@Override
	public void pub() {
		// TODO Auto-generated method stub
		super.pub();
	}
}
