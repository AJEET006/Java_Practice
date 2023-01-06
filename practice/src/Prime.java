
public class Prime {

    public static void main(String[] args) {
        int num = 7, cnt=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0) cnt++;
        }
        if(cnt>0) System.out.print(num+" "+"Not a prime number");
        else System.out.print(num+" "+" a prime number");
    }

}
