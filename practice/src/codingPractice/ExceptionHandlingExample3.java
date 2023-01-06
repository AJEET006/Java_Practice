package codingPractice;
public class ExceptionHandlingExample3 {
	
	
		public static void main(String[] args) {
			try {
				System.out.println(args[0].toUpperCase());
				//if args[1] or args[0] is not given we get ArrayIndexOutOfBoundsException		
				//if args[1] is not an integer in string then NumberFormateException
				int x = Integer.parseInt(args[1]); //we can pass two arguments in run configuration
				
				int division = 100/x;//if x is 0 we get ArithmaticException
				System.out.println(division);
				//String[] arr = new String[3];
				
				System.out.println(args[0].toLowerCase());
			}
//			catch(Exception e) //acting like a sink that matches everything other than above
//			{
//				//stack methods are shown
//					e.printStackTrace();
//			}//Unreachable catch block for ArrayIndexOutOfBoundsException. It is already handled by the catch block for Exception
			
			 catch(ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e)
			 {
			 	System.out.println("catching "+e);
			 }
			
			// //sub class must be above to super class
			 catch(Exception e) //acting like a sink that matches everything other than above
			 {
			 	//stack methods are shown
			 		e.printStackTrace();
			 }
			
			
			System.out.println("end of try catch block, program ends properly");
		}
	


}

