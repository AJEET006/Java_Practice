package inheritance;

class Arithmatic{
    
    public Arithmatic()
    {
        System.out.println("A");
    }
    public int add(int num1 ,int num2)
    {
        System.out.println("A method");
        int sum = num1+num2;
       return sum; 
    }
}
  class Adder extends Arithmatic
{
    public Adder()
    {   
        System.out.println("B");     
    }
    
    @Override
    public int add(int num1, int num2)
    {
       System.out.println("B method");
        return num1+num2;
    }
   
}
//Write your code here

public class Solution{
    public static void main(String []args){
        // Create a new Adder object
        Arithmatic a = new Adder();
        a.add(10, 20);
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + 
        			a.getClass().getSuperclass().getName());	
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " 
        									+ a.add(10,10) + "\n");
     }
}