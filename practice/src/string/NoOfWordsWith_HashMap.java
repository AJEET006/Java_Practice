package string;
import java.lang.*;
import java.util.*;
public class NoOfWordsWith_HashMap{

    public static int words(String str)
    {
        int count=0;
        Map<String,Integer> hmap = new HashMap<>();
        String [] s = str.split(" ");
        for(String word : s)
        {
            Integer i = hmap.get(word);
            if(i==null)
            {
                hmap.put(word,1);
            }
            else
                hmap.put(word,i+1);
        }
        
        for(String i : hmap.keySet())
        {
            System.out.print(i+" ");
        }
        for(int i : hmap.values())
        {
            count+=i;
        }
        
//        Iterator<String> it = hmap.keySet().iterator();       //keyset is a method  
//        while(it.hasNext())  
//        {  
//            String key=it.next();
//            count+=hmap.get(key);
//            System.out.println("word: "+key+"    count: "+hmap.get(key));  
//        }  
   
        
        
    //for (Map.Entry<String, Integer> set :hmap.entrySet())
    //        {
    //            count+=set.getValue();
    //        }
    return count;
}
public static void main(String [] args)
{
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int n = words(str);
    System.out.println(n);
}
}
