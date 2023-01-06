package exception;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Game g = new Game();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        
//        try {
//            int i=0;
//            int result = 56/0;
//        }catch(Exception e) {
//            
//        }
//        catch(ArithmeticException e) // unreachable catch block
//        {
//            
//        }
        try {
            g.test(num);
        }
        
        catch (OnClick e) {
            System.out.println(e);
        }
     
        finally {
            System.out.println("Working properly");
            sc.close();
        }
    }

}
