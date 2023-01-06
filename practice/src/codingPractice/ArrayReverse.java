package codingPractice;

public class ArrayReverse {
    static public void main(String [] args)
    {
        int [] num = {10,23,85,2,86,79,45};
        for(int k=0;k<num.length;k++)
        {
            System.out.print(num[k]+" ");
        }
        System.out.println();
       reverseArray(num,0,num.length-1);
        for(int k=0;k<num.length;k++)
        {
            System.out.print(num[k]+" ");
        }

    }

    private static void reverseArray(int[] num, int i, int j)
    {
        int temp=0;
        if(i>=j)
        { 
         return;
        
        } 
            temp=num[i];
            num[i]=num[j];
            num[j]=temp;
            reverseArray(num, i+1, j-1);       
    
    }
}

