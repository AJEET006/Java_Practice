
public class SwapWithoutThirdVar 
{
    public static void main(String[] args) {
        int a=6;
        int b=9;
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
}
