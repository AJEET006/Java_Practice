package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
//        char arr[] = {'a','a','b','c','a','b','c','d'};
//        Set<Character> set = new HashSet<>();
//        
//        // Iterate through the array
//        for (char t : arr) {
//            // Add each element into the set
//            set.add(t);
//        }
//        System.out.print(set);
        
        
        
        Integer arr [] = {45,89,62,32,47,8,96,45,1,26,1,2,8};
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(arr));
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }

    }

}
