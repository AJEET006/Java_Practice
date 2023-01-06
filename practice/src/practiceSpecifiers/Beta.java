package practiceSpecifiers;

abstract class Beta {
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
	abstract void abst();
	public int getNum() {
		return num;
	}
	public static int getNum3() {
		return num3;
	}
	public static void setNum3(int num3) {
		Beta.num3 = num3;
	}
	
	
	
}
class betaChild extends Beta{

	@Override
	void abst() {
		System.out.println("child class of beta abstract class" +
							"abstract method");
	}
	
}
