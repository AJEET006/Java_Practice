package practiceSpecifiers;

public class Main{
	public static void  main(String [] args)
	{
		Alpha alpha = new Alpha();
//	    Beta beta = new Beta();//abstract class can not instantiated
		Gamma gamma = new Gamma();//final classes can be instantiated
		alpha.proc();
		//alpha.priv();
		alpha.pub();
		alpha.defau();
		
		Delta.del();
		
		Beta.setNum3(45);
	}	
}
