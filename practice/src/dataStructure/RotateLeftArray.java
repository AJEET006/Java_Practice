package dataStructure;

public class RotateLeftArray
{
    /* this method is not valid when no. of rotation is more than length
    public static void leftRotate(int [] arr,int d,int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=arr.length-1;i>=0;i--)
        {
            for(int j=0;j<d;j++)
            {
               int temp=arr[i];//7
               arr[i]=arr[j];//10
               arr[j]=temp;//7
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    */
    static void rotate(int arr[], int d, int n)
    {
        int temp[] = new int[n];   
        int k = 0;
        for (int i = d; i < n; i++) {
            temp[k] = arr[i];
            k++;
        }
     
        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }
       
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+" ");
        }
    }
   public static void main(String [] args)
   {
       int [] arr = {10,2,3,5,6,7};
       int n = arr.length;
       int d = 2;
       rotate(arr,d,n);
      // leftRotate(arr,d,n);
   }
}
