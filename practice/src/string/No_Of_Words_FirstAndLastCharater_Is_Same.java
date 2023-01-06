package string;
import java.util.Scanner;
public class No_Of_Words_FirstAndLastCharater_Is_Same {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String [] str = sc.nextLine().trim().split(" ");
       System.out.println(str[2]);
       int cnt=0;
       for(int i=0;i<str.length;i++)
       {
           String s =str[i];
           char [] ch = s.toCharArray();
          
               if((ch[0]==ch[ch.length-1]))
                   cnt++;
         
               
       }
       System.out.println(cnt);
    }

}
