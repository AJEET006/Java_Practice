package practiceSpecifiers;

final class Gamma {
	final int num=7;
	public int num1=6;
	int num2=8;
	static int num3=9;
	//abstract int num4=90;//only public, protected, private, 
	//static, final, transient & volatile are permitted
	private int num5=29;
	transient int num6=90;
	volatile int num7=78;
	// methods-------------------
	protected void protec() {}
	private void priv() {}
	final void fina() {}
	void defau() {}
	static void stat() {}
//	abstract void abst(); //can not declare abstract method in final class
	
}
//class gammaChild extends Gamma{} //we can not extends final classes
	

