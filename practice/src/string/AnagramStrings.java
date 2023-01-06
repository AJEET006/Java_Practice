package string;

import java.util.Iterator;

public class AnagramStrings {

    public static void main(String[] args) {
        String s1 = "Mother in law";
        String s2 = "Hitler woman";

        String s3 = toLowerCase(s1);
        String s4 = toLowerCase(s2);
        //System.out.println(s3+"     "+s4);
        
        char ch1 [] = s3.toCharArray() ;       
        char ch2 [] = s4.toCharArray() ;
        //System.out.println(ch1.length+" "+ch2.length);

        String str1="";
        String str2 = "";
        
        for (char c : ch1)
        {
            if(c!=' ') 
                str1=str1+c;
        }
        for (char c : ch2)
        {
            if(c!=' ') 
                str2=str2+c;
        }
        //System.out.println(str1.length()+" "+str2.length());
        String nstr1= sort(str1);
        String nstr2 = sort(str2);
        System.out.println(nstr1+" "+nstr2);
       System.out.println(nstr1.equals(nstr2));

        boolean b = compare(nstr1,nstr2);
        if(b)
        {
            System.out.println("Strings are Anagram");
            
        }
        else  System.out.println("Strings are not Anagram");


    }

    public static String toLowerCase(String str)
    {
        char [] ch = str.toCharArray();
        String nstr="";
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>=65 && ch[i]<=90)
            {
                nstr+=(char)(ch[i]+32);
            }
            else 
                nstr+=ch[i];
            
        }
        return nstr;
    }

    public static String sort(String str)
    {
        char ch [] = str.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
            for (int j = i+1; j < ch.length; j++)
            {
                if(ch[i]>ch[j])
                {
                    char temp = ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        String nstr = new String(ch);
        return nstr;
    }

    public static boolean compare(String str1, String str2)
    {
        char [] ch1 = str1.toCharArray();
        char ch2 [] = str2.toCharArray();
        if(str1.length()!=str2.length()) 
            System.out.println("Strings are not Anagram");

       
        for(int i=0;i<ch1.length;i++)
        {
            if(ch1[i]!=ch2[i]) 
            {
                return false;
            }
            
        }
        return true;
       
    }

}
