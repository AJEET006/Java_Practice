package string;
import java.util.Scanner;
public class NoOfWords{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(wordcount(str));


    }
    static int wordcount(String string)  
    {  
        int count=0;  

        char ch[]= new char[string.length()];     
        for(int i=0;i<string.length();i++)  
        {  
            ch[i]= string.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count; 
    }
}
//        int cnt=1;
//        if(str.length()==0) System.exit(0);
//        for(int i=0;i<str.length();i++)
//        { 
//            if(str.charAt(i)==' ')
//            {
//                cnt++;
//            }
//            System.out.print(str.charAt(i));
//        }
//        System.out.println("\n"+cnt);
    

    
//     static int wordcount(String str) {
//      int cnt=0;
//      char []  ch = str.toCharArray();
//      for(int i=0;i<ch.length;i++)
//      {
//          char c = ch[i];
//          if((i==0 && ch[i]!=' ') || (ch[i]==' '&& ch[i+1]!=' ') && ch[ch.length-1]!=' ')
//          {
//              cnt++;
//          }
//      }
//        return cnt;
//    }














