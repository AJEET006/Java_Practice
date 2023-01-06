import java.lang.Math; 
public class SmallestValueFromArray {

    static int  minValue(int n, int[] a, int s)
    {

       
        for(int i = 1;i<=n;i++)
        { 
            int sum=0;
            for(int j = 0;j<n;j++)
            { 
                sum+=Math.ceil(a[j]/i);

            }
            if(sum<=s)
            {
                return i;
            }

        }
        return 0; 
    }

    public static void main(String[] args) {

        int A [] = {3,4,7,2};
        int N=4;
        int s = 5;

        int D= minValue(N,A,s);
        System.out.println(D);
    }



}
