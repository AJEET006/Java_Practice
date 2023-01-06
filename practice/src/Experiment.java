
public class Experiment {
//Q: make a compound having atomic mass x with four molecules having mass a,b,c,d,a,b are monoatomic
    // while c,d are diaAtomic find number of molecules needed to form compund x;
    public static int exp(int a,int b, int c, int d,int x)
    { 
        int cnt=0;
        int sum=0;
        while(sum<x)
        {
            if(sum<x)
            {
                sum+=a;
                cnt++;
                System.out.println(sum+" "+cnt);
            }
            if(sum<x)
            {
                sum+=b;
                cnt++;
                System.out.println(sum+" "+cnt);
            }
            if(sum<x)
            {
                sum+=c*2;
                cnt++;
                System.out.println(sum+" "+cnt);
            }
            
            if(sum<x)
            {
                sum+=d*2;
                cnt++;
            }
        }
      
        return cnt;
        
        
    }
    public static void main(String[] args) {

        //exp(2,3,4,5,64);
        System.out.println(  exp(5,8,5,3,110));

    }

}
