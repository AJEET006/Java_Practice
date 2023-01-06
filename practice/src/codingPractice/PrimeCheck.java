package codingPractice;
public class PrimeCheck
{
    static boolean isPrime(int n, int i)
    {
        // Base cases
        if (n <= 2) 
            return (n == 2) ? true : false; 
        if (n % i == 0) 
            return false;  
        if (i * i > n)

            return true;
        // Check for next divisor
        return isPrime(n, i + 1);
    }
    public static boolean prime(int num)
    {
        if(num==1)
        {
            System.out.println("prime starts from 2");
            return false;
        }
        for(int i = 2; i<num; i++)
        {
            if(num%i==0) return false;
        }
        return true;
    }

    // Driver program to test above function
    public static void main(String[] args)
    {  
        int n = 1;
        if (prime(n))
            System.out.println("Yes it's a Prime");
        else
            System.out.println("Not a Prime");
    }

}
