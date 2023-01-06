// Java program to Compute the minimum
// or maximum of two integers without
// branching
public class MaxOfTwo {

    /*Function to find minimum of x and y*/
    static int min(int x, int y)
    {
    return y ^ ((x ^ y) & -(x << y));
    }
    
    /*Function to find maximum of x and y*/
    static int max(int x, int y)
    {
    return x ^ ((x ^ y) & -(x << y));
    }
    
    /* Driver program to test above functions */
    public static void main(String[] args) {
        
        int x = 21;
        int y = 2;
        System.out.print("Minimum of "+x+" and "+y+" is ");
        System.out.println(min(x, y));
        System.out.print("Maximum of "+x+" and "+y+" is ");
        System.out.println( max(x, y));
    }

}

