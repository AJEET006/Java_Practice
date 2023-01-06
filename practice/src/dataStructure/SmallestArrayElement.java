package dataStructure;

public class SmallestArrayElement {

    static boolean search(int [] arr , int num)
    {        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                System.out.println("index is   "+ (i+1)+"\n");
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,20,5,89,63,118,2,9,6,7,0};
        boolean b =search(arr, 0);
        if(b) System.out.println("element is present in array");
        else
            System.out.println("not in array");
        //       int small = Integer.MAX_VALUE;
        //       for(int i=0;i<arr.length;i++)
        //       {
        //           if(small>arr[i])
        //           {
        //               small=arr[i];
        //           }
        //       }       
        int i=0;
        if(i==0)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }         
        //System.out.println(arr[0]);
    }


}
