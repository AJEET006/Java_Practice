package dataStructure;

public class MergeTwoSortedArray {

    public static void main(String[] args) {

        int [] num = {45,56,2,18,97,112};
        int [] arr = {6,25,89,5,48,10,26};
        int n=num.length;
        int nnum[]=sort(num,n);
        for(int ch : nnum)
        {
            System.out.print(ch+" ");
        }




    }
    private static int [] sort(int arr[], int n)   
    {  
        int temp;
    
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--)
            {
                if (arr[j] < arr [j - 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;

    }
}
