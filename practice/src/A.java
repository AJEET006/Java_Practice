//class A {
//    public static void main(String args[]) 
//    {
//        binary(50);
//
//        //        byte b = 60;
//        //        //b = (byte) (b * 50);
//        //        System.out.println(b);
//
//        //        double a, b,c;
//        //        a = 3.0/0;
//        //        b = 0/4.0;
//        //        c=0/0.0;
//        //
//        //        System.out.println(a);
//        //        System.out.println(b);
//        //        System.out.println(c);
//
//    } 
//    public static void binary(int num)
//    {
//        int bin [] = new int [1000] ;       
//        int i =0;
//        while(num>0)
//        {         
//            bin[i]= num%2;
//            num=num/2;
//            i++;
//        }
//        
//        for (int j = i - 1; j >= 0; j--)
//            System.out.print(bin[j]);
//   
//    } 
//}
class Test {
    protected int x, y;
}
 
 class A {
    public static void main(String args[]) {
        Test t = new Test();
        System.out.println(t.x + " " + t.y);
    }
}

