package collections;

import java.util.Collections;

public class SetMore {
    public static void main(String [] args)
    {
        int arr[] = {32, 1, 65, 2, 4, 5, 6, 8, 9, 45, 55, 89, 26, 62};
        java.util.Set<Integer> set = new java.util.HashSet<>();
        for(Integer i : arr)
        {
            set.add(i);
        }
        System.out.println(set);
        java.util.ArrayList<Integer> al = new java.util.ArrayList<>(set);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        System.out.println("Second Minimum  "+al.get(1) + "\nSecond Heighest " +al.get(al.size()-2));       
    }
}