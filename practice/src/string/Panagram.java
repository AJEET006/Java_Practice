package string;
// a sentence containing every letter of alphabets
public class Panagram {

    public static void main(String[] args) {
       String str="The quick brown fox jumps over a lazy dog";
       System.out.println(str);
       String nstr = "";
       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i)!=' ')
           {
               nstr=nstr+str.charAt(i);
           }
       }
      
       String s = toLowerCase(nstr);
      
       boolean b = panagram(s);
       if(b) System.out.println("sentence is Anagram");
       else System.out.println("sentence is not an Anagram");
    }
    public static String toLowerCase(String str)
    {
        char ch [] = str.toCharArray();
        String s = "";
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>=65 && ch[i]<=90)
            {
                s=s+(char)(ch[i]+32);
            }
            else
                s=s+ch[i];
        }
        return s;
    }
    
    public static boolean panagram(String str)
    {
      
        for(int i='A';i<='Z';i++)
        {
           // System.out.print(str.indexOf(i)+" "+i);
           // System.out.print(str.indexOf((char)(i+32))+" ");
            if((str.indexOf(i)<0) && (str.indexOf((char)(i+32))<0))
                return false;
            
        }
        return true;
    }
}
