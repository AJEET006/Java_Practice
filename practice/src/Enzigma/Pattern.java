package Enzigma;
class Pattern{
    public static void main(String[] args) {
        for( int i=1; i<=8;i++)
        {
            System.out.print("a");
            if (i%2!=0)
            { 
                System.out.print(i);
                System.out.print("A");
            }
            else 
            { 
                for(int j=1;j<=i;j++)
                    System.out.print("A");
            }
            System.out.println();
        }
    }
}
