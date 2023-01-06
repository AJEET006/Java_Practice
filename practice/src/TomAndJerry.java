import java.util.*;
public class TomAndJerry {

    public static String decideWinner(int n, int m)
    {
        //if n = m^x //then tom win and print x otherwise jerry wins and print -1
        String str="";
        int y = n;
        int x=0;
        while(n!=0)
        {
            if((n%m)==0)
            {
                x++;
            }
            n=n/m;
        }
                
        if(y==power(m, x))
        {
            System.out.println("Tom wins");
            return str+x;
        }

        else
        {
            System.out.println("Jerry wins");
            return "-1";
        }
            
    }
    static int power(int N, int P)
    {
        int pow = 1;
        for (int i = 1; i <= P; i++)
            pow *= N;
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String result = decideWinner(n,m);
        System.out.print(result);
    }

}
