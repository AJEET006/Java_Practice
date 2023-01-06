package exception;
import java.util.*;
public class Game {

    public void test(int num) throws OnClick
    {
      
       if(num<2) System.out.println("Game is on");
       else
           throw new OnClick();
    }

}
