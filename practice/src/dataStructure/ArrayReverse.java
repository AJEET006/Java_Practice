package dataStructure;

//Iterative java program to reverse an
//array
public class ArrayReverse {
 
/* Function to reverse arr[] from
 start to end*/
 static void rvereseArray(int arr[] )
 {
     int s=0,l=arr.length-1;
     while(s<l)
     {
         int temp=arr[s];
         arr[s]=arr[l];
         arr[l]=temp;
         s++;
         l--;
     }
 }   
 
 /* Utility that prints out an
 array on a line */
 static void printArray(int arr[],
                         int size)
 {
     for (int i = 0; i < size; i++)
         System.out.print(arr[i] + " ");
     
     System.out.println();
 }

 // Driver code
 public static void main(String args[]) {
     
     int arr[] = {1, 2, 3, 4, 5, 6};
     printArray(arr, 6);
     rvereseArray(arr);
     System.out.print("Reversed array is \n");
     printArray(arr, 6);
     
 }
}

//This code is contributed by Sam007

