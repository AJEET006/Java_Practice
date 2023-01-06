// Java implementation to count
// number of digits in the product
// of two numbers
import java.io.*;
import java.math.*;

class NoOfDigits {
    
    // function to count number of digits
    // in the product of two numbers
    static int countDigits(int a, int b)
    {
        int count = 0;
        
        // absolute value of the
        // product of two numbers
        int p = Math.abs(a * b);
        
        // if product is 0
        if (p == 0)
            return 1;
        
        // count number of digits in
        // the product 'p'
        while (p > 0)
        {
            count++;
            p = p / 10;
        }
        
        // required count of digits
        return count;
    }
    
    public static void main(String args[])
    {
        int a = 12;
        int b = 4;
        System.out.println("Number of digits = "
                        + countDigits(a, b));
    }
}

