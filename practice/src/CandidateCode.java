import java.util.*;
public class CandidateCode
{
    public static void main(String[] args)
    {
        Scanner sr = new Scanner(System.in);
        int n;
        n = sr.nextInt();
        if(n<0)System.out.println("Error:Invalid Amount");
        else if(n%10!=0)
            System.out.println("Error:The amount entered needs to be in multiples of 10");
        else
        {
            if(n>=50){
                System.out.print((n/50)+"*50 ");
                n = n - (n/50) * 50;
            }
            if(n>=20){
                System.out.print((n/20)+"*20 ");
                n = n - (n/20) * 20;
            }
            if(n>=10){
                System.out.print((n/10)+"*10");
            }
        }
    }
}
