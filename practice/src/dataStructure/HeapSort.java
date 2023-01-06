package dataStructure;

public class HeapSort {

    public static void conquer(int [] arr,int l,int mid, int h)
    {
        int [] merged = new int [h-l+1];
        int idx1 = l;
        int idx2 = mid+1;
        int x= 0;
        while(idx1<=mid && idx2<=h)
        {
            if(arr[idx1]<=arr[idx2])
            {
                merged[x++]=arr[idx1++];
                
            }else {
                merged[x++]=arr[idx2++];
            }
        }
        //if some element is remaining either left array or right array then just put it as it is;
        while(idx1<=mid) merged[x++]=arr[idx1++];
        while(idx2<=h) merged[x++]=arr[idx2++];
        
        //copy the elements into original array
        for(int i=0,j=l;i<merged.length;j++,i++)
        {
            arr[j]=merged[i];
        }
    }
    public static void divide(int [] arr,int l,int h)
    {
        //dividing the array till signle element;
        if(l>=h)return;
        int m = l+(h-l)/2;
        divide(arr,l,m);
        divide(arr,m+1,h);
        
        //merge the array into sigle unit
        conquer(arr,l,m,h);
    }
    public static void main(String[] args) {
       int [] arr = {45,2,56,0,19,86,49,3};
       divide(arr,0,arr.length-1);
       for(int i : arr)
       {
           System.out.print(i+" ");
       }
    }

}
