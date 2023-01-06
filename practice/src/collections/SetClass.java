package collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
public class SetClass {

    public static void main(String[] args)
    {
        String [] runs = {"two","four","one","six","two","six","zero"};
        List<String> list = new ArrayList<String>();
        list.addAll(new HashSet<String>(Arrays.asList(runs)));
        Collections.sort(list);
        System.out.println(list);
        list.set(3,"three");
        list.addAll(list.subList(1, list.size()-1));
        list.remove(2);
        list.add(1,"six");
        System.out.println(list); 
    }
}
