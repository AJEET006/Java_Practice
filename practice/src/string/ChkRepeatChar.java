package string;
import java.util.Map;
import java.util.HashMap;
public class ChkRepeatChar {
    public static void main(String [] args)
    {
        String str = "my name is ajeet singh";
        char [] ch = str.toCharArray();
        Map<Character,Integer> m = new HashMap<>();
        for(char c :ch)
        {
            if(c==' ') continue;
            if(m.containsKey(c))
            {
                m.put(c, m.get(c)+1);
            }
            else
                m.put(c,1);
        }
        
        for(char c : m.keySet())
        {
            if(m.get(c)>1)
            {
                System.out.println(c+" found "+m.get(c)+" times");
            }
        }
    }

}
