package codingPractice;

public class PrintPrimeNumbers {
    static void print(int num)
    {
        for(int i=1;i<=num;i++)
        {
            boolean isPrime=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
                System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        print(25);
    }

}
