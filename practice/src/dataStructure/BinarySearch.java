package dataStructure;

public class BinarySearch {
    static boolean binarySearch(int [] arr,int num)
    {
        int s=0 ;
        int l = arr.length-1;
       
        while(s<l)
        { 
            int m = (s+(l-s))/2;
            if(num==arr[m])
            {
                System.out.println(m);
                return true;
            }
             else if(num<arr[m]) l=m-1;
            else
                s=m+1;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {0,4,12,20,40,85,96,118,999,22};
        boolean b = binarySearch(arr,85);
        if(b)  System.out.println("   given number is present at index");
        else System.out.println("not present");
    }

}
