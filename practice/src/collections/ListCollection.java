package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ListCollection implements Comparable<ListCollection>
{
    @Override
    public int compareTo(ListCollection o) {

        return 0;
    }

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        //list.add("Ajeet");
        list.add(96);
        list.add(5);
        list.add(78);
        //list.add('a');
        list.add(987);
        list.add(0);
        //list.add(new ArrayList<String>(Arrays.asList("Ajeet","Sandeep","Sameer")));

        List<Object> sortedList = list.stream().sorted().collect(Collectors.toList());        
        for(Object o : sortedList)
        {
            System.out.println(o);
        }

    }



}
