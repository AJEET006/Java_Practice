package string;
public class Rev
{
    public static void main(String [] args)
    {
        String str = "my name is sameer";
        String [] s = str.split(" ");
        String rstr="";
        String sstr = "";
        for(int i=0;i<s.length;i++)
        {
            rstr = s[i];
            String ls="";
            for(int j =rstr.length()-1;j>=0;j--)
            {   

                ls+= rstr.charAt(j);

            }sstr+=ls+" ";  
        }  
        System.out.println(sstr);

    }

}