package advanceJavaPractice;
import java.lang.*;
import java.util.*;

public class LamdaExpression {

    public static void main(String[] args) {
        Runnable i1 = ()->{
            int i=1;                      
            System.out.println(5*i);  
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        };
        Thread t1 = new Thread(i1);
        t1.start();
        
    }

}
