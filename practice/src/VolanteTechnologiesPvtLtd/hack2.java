package VolanteTechnologiesPvtLtd;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

//import java.util.ArrayList;
//import java.util.List;
//
//public class Pra {
//    int getV()
//    {
//        int r = 10;
//        try {
//            String [] s = {"try block",
//                    "try block is running"};
//            System.out.println(s[1]);
//        } catch (Exception e) {
//           System.out.println("catch block: "+r);
//           return r;
//        }
//        finally {
//            r+=10;
//            System.out.println("finally block : "+r);
//        }
//        return r;
//    }
//
//    public static void main(String[] args) {
////       Pra p = new Pra();
////       System.out.println("main block : "+p.getV());
//        int [] array = {3,6,9,5};
//        List<Integer> a = new ArrayList<>();
//        a.add(array[0]);
//        a.add(array[2]);
//        a.set(1, array[0]);
//        a.set(1, array[1]);
//        a.remove(0);
//        a.add(array[0]);
//        System.out.println(a);
//
//    }
//
//}



//class hack1{
//    hack1 get() {
//        return this;
//    }
//}
//
//public class hack2 extends hack1{
//    @Override
//    hack2 get()
//    {
//        return this;
//    }
//    void msg() {
//        System.out.println("welcome");
//    }
//    public static void main(String[] args) {
//        new hack2().get();
//    }
//}

//class hack2{
//    static void charNum(String s)
//    {
//        HashMap<Character, Integer> ch = new HashMap<>();
//        char [] chArray = s.toCharArray();
//        for(char c : chArray)
//        {
//            if(ch.containsKey(c))
//            {
//                ch.put(c, ch.get(c)+1);
//            }
//            else
//            {
//                ch.put(c, 1);
//            }
//        }
//        Set<Character> chStr = ch.keySet();
//        for(Character chh : chStr)
//        {
//            if(ch.get(chh)>1)
//            {
//                System.out.println(chh+" : "+ch.get(chh));
//            }
//        }
//    }
//    public static void main(String[] args) {
//        charNum("Hacker23EARTH");
//    }
//}


//class Hacker
//{
//    static int add(int a, int b)
//    {
//        return a*b/a;
//    }
//    static int add(int a, int b , int c)
//    {
//        return a*b/c;
//    }
//}
//class hack2{
//    public static void main(String[] args) {
//        System.out.println(Hacker.add(4, 6));
//        System.out.println(Hacker.add(2, 4, 6));
//    }
//}

//interface StrFunc{
//    String disp(String n);
//}
//class hack2{
//    public static void main(String[] args) {
//        StrFunc output = (str)->{
//            String result = "";
//            int a;
//            for(a=str.length()-1; a>=0; a--)
//            {
//                result+=str.charAt(a);
//                
//            }return result;
//        };
//        System.out.println(output.disp("HACKEREARTH"));
//    }
//}

//class hackster extends Thread
//{
//    @Override
//    public void run() {
//        try {
//            System.out.println("Thread"+Thread.currentThread().getId()+"is running");
//        } catch (Exception e) {
//            // TODO: handle exception
//        }
//    }
//}
//class hack2{
//    public static void main(String[] args) {
//        int n=4;
//        for(int i=0;i<n;i++)
//        {
//            hackster obj = new hackster();
//            obj.start();
//        }
//    }
//}

//class hack2{
//    public static void main(String[] args) {
//        try {
//            int res = 5%0;
//        } catch (ArithmeticException e) {
//           System.out.println("ArithmeticException => "+e.getMessage());
//        }
//        finally {
//            System.out.println("final reult");
//        }
//    }
//}
class hack2{
    public static void main(String[] args) {
        try {
            File obj = new File("filename.txt");
            Scanner sc = new Scanner(obj);
            while(sc.hasNextLine())
            {
                String info = sc.nextLine();
                System.out.println(info);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured. ");
            e.printStackTrace();
        }
    }
}