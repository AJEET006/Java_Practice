package codingPractice;

public class SumOfPrimes {
    public static int sumPrime(int num)
    {
        int sum = 0;
        for(int i=1;i<=num;i++)
        {       
            if(isPrime(i)) {
                sum=sum+i;              
            }
        }
        return sum;
        
    }
    public static boolean isPrime(int n)
    {
        if(n==1) return false;
        for(int i=2;i<n;i++)
        {
              if(n%i==0) return false;     
        }
        return true;
    }
    public static void main(String[] args) {

        int res = sumPrime(100);
        System.out.println(res);

    }

}
