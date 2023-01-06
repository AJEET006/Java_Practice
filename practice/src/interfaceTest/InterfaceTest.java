package interfaceTest;

public interface InterfaceTest {

	final int num=7;
	public int num1=6;
	int num2=8;
	static int num3=9;
	
	//private int num5=29;//we cant declare private property in interface
	//transient int num6=90;//we cant declare transient property in interface
	//volatile int num7=78;//we cant declare volatile property in interface
	
	
	// methods-------
	//       we can not declare private,abstract,protected,
	//			final,default methods in interfaces
		//protected void protec() {}
		//private void priv() {}
		//final void fina() {}
		//void defau() {}
	 static void stat() {}
	abstract void abst();
	public default void fun() {}
}

