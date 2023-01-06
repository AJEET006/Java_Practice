package specifiersSecondPackage;
import practiceSpecifiers.Alpha;
//import practiceSpecifiers.Gamma;

public class Main{

	public static void main(String[] args) {
		
		Alpha alpha = new Alpha();
		//Gamma gamma = new Gamma(); //we can not instatiate final class 
									//in other package
//		alpha.proc();
//		alpha.priv();
//		alpha.defau();
		alpha.pub();
		
		Theta theta = new Theta();
		theta.proc();
		theta.pub();
	}

}
